package core_java.nested_classes.inner_class;

public class Anonymous_classTest {
    public static void main(String[] args) {


//        Анонимный вложенный внутренний класс
//        это полноценный внутренний класс Поэтому у него есть доступ к переменным внешнего класса, в том числе к статическим и приватным:
//        Применяйте анонимные классы, если вам нужен локальный класс для одноразового использования

        MonitoringSystem generalModul = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг общих показателей стартовал!");
            }
        };

        MonitoringSystem securitulModul = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг sequrity стартовал!");
            }
        };

        MonitoringSystem errorModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг отслеживания ошибок стартовал!");
            }

        };
        errorModule.startMonitoring();
        securitulModul.startMonitoring();
        generalModul.startMonitoring();
    }
}
