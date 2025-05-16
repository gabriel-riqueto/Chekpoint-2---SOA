package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        return "Cabernet Sauvignon; Merlot; Pinot Noir; Chardonnay; Syrah; Malbec";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Seu pedido foi confirmado!" + quantity + "x " + name;
    }

}
