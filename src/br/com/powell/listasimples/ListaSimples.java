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
        
        listaSimples = (ListView) findViewById(R.id.listView1);
        definindoAdaptador();
        listaSimples.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> item, View arg1, int posicao,
					long arg3) {
				String guitarra = (String) item.getItemAtPosition(posicao);
				Toast.makeText(ListaSimples.this, "Eu gosto da guitarra: " + guitarra, 
						Toast.LENGTH_LONG).show();
			}
		});
    }

	private void definindoAdaptador() {
		ArrayList<String> guitarras = criaNomeDeGuitarras();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, 
        		android.R.layout.simple_list_item_1, guitarras);
        listaSimples.setAdapter(adapter);
	}

	private ArrayList<String> criaNomeDeGuitarras() {
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
