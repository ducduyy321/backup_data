import java.util.Scanner;

public class TinhTienDien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số kWh tiêu thụ
        System.out.print("Nhập số kWh đã tiêu thụ: ");
        double soKwh = scanner.nextDouble();

        // Nhập giá cước mỗi kWh
        System.out.print("Nhập giá cước mỗi kWh: ");
        double giaCuoc = scanner.nextDouble();

        // Tính tiền điện
        double tienDien = soKwh * giaCuoc;

        // In ra màn hình số tiền phải trả
        System.out.println("Số tiền điện cần thanh toán: " + tienDien + " VNĐ");

        scanner.close();
    }
}
}
