package org.example.btth;

import java.util.Scanner;
/*
Input: username (String), balance (double/long).

Output: Thông báo trừ tiền thành công hoặc Cảnh báo (Popup/Âm thanh) nếu số dư < 5.000 VNĐ.

Kỹ thuật DI: Constructor Injection.

Lý do: Đây là cách an toàn nhất, đảm bảo PlaySessionService luôn có đủ dịch vụ cảnh báo trước khi hoạt động và dễ dàng Unit Test.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PlaySessionService service = context.getBean(PlaySessionService.class);

        service.checkBalance("player1", 3000);
        service.checkBalance("vipUser", 10000);
        service.checkBalance("", 2000);
        service.checkBalance("bugUser", -100);
    }
}
