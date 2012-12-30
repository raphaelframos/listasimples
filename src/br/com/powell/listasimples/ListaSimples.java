package br.com.powell.listasimples;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListaSimples extends Activity {
	
	private ListView listaSimples;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_simples);
        
        atribuiView();
        definindoAdaptador();
        
        listaSimples.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> item, View arg1, int posicao,
					long arg3) {
				//Seleciona o item da lista, retornando o objeto do adapter, no caso um String
				String guitarra = (String) item.getItemAtPosition(posicao);
				Toast.makeText(ListaSimples.this, "Eu gosto da guitarra: " + guitarra, 
						Toast.LENGTH_LONG).show();
			}
		});
    }

	private void atribuiView() {
		listaSimples = (ListView) findViewById(R.id.listView1);
	}

	private void definindoAdaptador() {
		
		ArrayList<String> guitarras = criaListaDeNomesDeGuitarras();
		
		//Cria o adapter para a lista 
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, 
        		android.R.layout.simple_list_item_1, guitarras);
        listaSimples.setAdapter(adapter);
	}

	private ArrayList<String> criaListaDeNomesDeGuitarras() {
		ArrayList<String> guitarras = new ArrayList<String>();
		
		guitarras.add("Tagima");
		guitarras.add("Fender");
		guitarras.add("Gibson");
		guitarras.add("Jackson");
		guitarras.add("Ibanez");
		guitarras.add("Tonante");
		guitarras.add("Gianini");
		guitarras.add("Epiphone");
		guitarras.add("Memphis");
		return guitarras;
		
	}
    
}
