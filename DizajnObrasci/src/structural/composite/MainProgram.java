package structural.composite;

import structural.composite.compositions.Computer;
import structural.composite.compositions.MotherboardAssembly;
import structural.composite.compositions.StorageSystem;
import structural.composite.leafs.CPU;
import structural.composite.leafs.HDD;

public class MainProgram {
    public static void main(String[] args) {

        // Kreiranje computer objekta
        ComputerPartComposite computer = new Computer("Computer", 1400.10);
        // Kreiranje motherboard assembly objekta
        ComputerPartComposite motherboard = new MotherboardAssembly("ASUS ROG Strix Z690-E", 450.0, computer);
        // Kreiranje storage system objekta
        ComputerPartComposite storageSystem = new StorageSystem("Storage System", 200.0, computer);

        computer.addPart(motherboard);
        computer.addPart(storageSystem);


        // Kreiranje procesora
        ComputerPart cpu = new CPU("Intel Core i7", 5000.0, motherboard);
        // Kreiranje graficke
        ComputerPart gpu = new CPU("NVIDIA RTX 3080 GPU", 9000.0, motherboard);

        motherboard.addPart(cpu);
        motherboard.addPart(gpu);

        // Kreiranje HDD-a
        ComputerPart hdd = new HDD("Crucial 1TB HDD", 6000.0, storageSystem);
        // Kreiranje SSD-a
        ComputerPart ssd = new HDD("Samsung 1TB NVMe SSD", 18000.0, storageSystem);

        storageSystem.addPart(hdd);
        storageSystem.addPart(ssd);
        
        // Prikaz specifikacija
        System.out.println("=== MOTHERBOARD ASSEMBLY ===");
        System.out.println(motherboard.getSpecifications());

        // Prikaz specifikacija
        System.out.println("=== STORAGE SYSTEM ===");
        System.out.println(storageSystem.getSpecifications());

    }
}
