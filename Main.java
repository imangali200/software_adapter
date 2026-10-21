public class Main {

    public static void main(String[] args) {
        ModernConsole console = new ModernConsole();
        RetroCartridge cartridge = new RetroCartridge();
        CartridgeAdapter adapter = new CartridgeAdapter(cartridge);

        console.playDigital(adapter);
    }
}
