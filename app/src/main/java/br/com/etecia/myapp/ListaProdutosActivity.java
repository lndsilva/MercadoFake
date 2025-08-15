package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListaProdutosActivity extends AppCompatActivity {

    RecyclerView idListaProdutos;
    List<Produtos> lstProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.lista_produtos_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //criando um array que vai carregar a lista de produtos
        lstProdutos = new ArrayList<>();
        lstProdutos.add(new Produtos("Asike", R.drawable.camera));
        lstProdutos.add(new Produtos("Cubo mágico", R.drawable.cubo_magico));
        lstProdutos.add(new Produtos("Drone", R.drawable.drone));
        lstProdutos.add(new Produtos("Camera instax", R.drawable.camera_instax));
        lstProdutos.add(new Produtos("Filme instax", R.drawable.filme_instax));
        lstProdutos.add(new Produtos("Fire TV", R.drawable.fire_tv));
        lstProdutos.add(new Produtos("Impressora mini", R.drawable.impressora_mini));
        lstProdutos.add(new Produtos("Echo Dot", R.drawable.echo_dot));

        idListaProdutos = findViewById(R.id.idListaProdutos);

    }
}