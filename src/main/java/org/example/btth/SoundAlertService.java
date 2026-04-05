package org.example.btth;

import java.util.Scanner;
import org.springframework.stereotype.Service;

@Service("soundAlert")
public class SoundAlertService implements AlertService{
    @Override
    public void alert(String name, double balance) {
        System.out.println("[SOUND] Tài khoản " + name + " sắp hết tiền: " + balance);
    }
}
