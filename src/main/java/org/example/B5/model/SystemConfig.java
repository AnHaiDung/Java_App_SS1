package org.example.B5.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class SystemConfig {
    @Value("An_Hải_Dũng")
    private String branchName;

    @Value("18:00")
    private String openingHour;

    public void displayConfig() {
        System.out.println("Tên: " + branchName);
        System.out.println("Giờ mở cửa: " + openingHour);
    }
}
