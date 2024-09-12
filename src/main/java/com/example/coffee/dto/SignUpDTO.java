package com.example.coffee.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class SignUpDTO {

    @NotBlank(message = "아이디를 입력해주세요.")
    private String accountId;

    @Size(min = 6, max = 20, message = "비밀번호는 6자 이상 20자 이하여야 합니다.")
    @NotBlank(message = "비밀번호를 입력해주세요.")
    private String password;

    @Pattern(regexp ="^(?:\\w+\\.?)*\\w+@(?:\\w+\\.)+\\w+$" ,message = "이메일 형식이 올바르지 않습니다.")
    @NotBlank(message = "이메일을 입력해주세요.")
    private String email;

    @Pattern(regexp = "^[ㄱ-ㅎ가-힣a-z0-9-_]{2,4}$", message = "이름은 특수문자를 제외한 2~4자리여야 합니다.")
    @NotBlank(message = "이름을 입력해주세요.")
    private String name;

    public SignUpDTO(String accountId, String password, String email, String name) {
        this.accountId = accountId;
        this.password = password;
        this.email = email;
        this.name = name;
    }

}
