package ca.gbc.inventoryservice.bootstrap;

import ca.gbc.inventoryservice.model.Inventory;
import ca.gbc.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final InventoryRepository inventoryRepository;

    @Override
    public void run(String... args) throws Exception {

        if(inventoryRepository.findbySkuCode("sku_12345").isEmpty()){

            Inventory widgets = Inventory.builder()
                    .skuCode("sku_12345")
                    .quantity(2)
                    .build();

            inventoryRepository.save(widgets);

        }
        if(inventoryRepository.findbySkuCode("sku_125").isEmpty()){

            Inventory widgets = Inventory.builder()
                    .skuCode("sku_125")
                    .quantity(4)
                    .build();

            inventoryRepository.save(widgets);

        }
        if(inventoryRepository.findbySkuCode("sku_345").isEmpty()){

            Inventory widgets = Inventory.builder()
                    .skuCode("sku_345")
                    .quantity(0)
                    .build();

            inventoryRepository.save(widgets);

        }
    }


}
