package umc.spring.validation.annotation;

import umc.spring.validation.validator.MemberExistValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = MemberExistValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ExistMember {

    String message() default "해당하는 멤버를 찾을 수 없습니다.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

//    @Documented
//    @Target({ElementType.FIELD, ElementType.PARAMETER})
//    @Retention(RetentionPolicy.RUNTIME)
//    public @interface List {
//        ExistMember[] value();
//    }
}
