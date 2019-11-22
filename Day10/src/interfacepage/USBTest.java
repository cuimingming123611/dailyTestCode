package interfacepage;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:17:08 2019-11-22
 */
public class USBTest {
public static void main(String args[]) {
    Computer computer = new Computer();
    Printer printer = new Printer();
    computer.transferData(printer);
}
}


class Computer{
    public void transferData(USB usb){
        usb.start();
        System.out.println("具体的传输内容，自己操作");
        usb.stop();
    }
}


interface USB{
    void start();
    void stop();
}

class Flash implements USB{
    @Override
    public void start() {
        System.out.println("u盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("u盘结束工作");
    }
}

class Printer implements USB{
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}