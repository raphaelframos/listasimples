package br.com.powell.listasimples;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaSimples extends Activity {
	
	private ListView listaSimples;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_simples);
        
        listaSimples = (ListView) findViewById(R.id.listView1);
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
