package core_java.nested_classes.inner_class;

public class Local_class_PhoneNumberValidator {
    final int i = 5;

    public void validatePhoneNumber(final String number) {
        final String russianCountryCode = "+7";

        //    Внутренние классы в локальном методе
//    Локальный кл. создается внутри метода
//    Объект его так же м. созд. только внутри этого метода, за пределами нельзя
//    имеет доступ к финальным пременным в этом методе или эффективно финальным ( которые после инициализации не меняли значение)

        class PhoneNumber {
            private final String phoneNumber;

            public PhoneNumber() {
                this.phoneNumber = number;

            }

            public void printRussianCountryCode() {
                System.out.println(russianCountryCode);
            }

        }

        //...код валидации номера
    }
}
