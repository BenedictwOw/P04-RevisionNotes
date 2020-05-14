package com.myapplicationdev.android.p04_revisionnotes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {
	ListView lv;
	ArrayAdapter aa;
	ArrayList<Note> notes;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_second);
		DBHelper db = new DBHelper(SecondActivity.this);
		super.onCreate(savedInstanceState);
		lv = (ListView)this.findViewById(R.id.lv);
		ArrayList<Note> notes = new ArrayList<>();
		notes = db.getAllNotes();
		aa = new RevisionNotesArrayAdapter(this, R.layout.row, notes);
		lv.setAdapter(aa);

	}
}
