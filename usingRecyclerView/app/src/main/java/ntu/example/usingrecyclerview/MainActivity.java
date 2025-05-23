package ntu.example.usingrecyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList <LandScape> recylerViewDatas;
    RecyclerView recyclerViewLandScape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recylerViewDatas = getDataForRecyclerView();
        recyclerViewLandScape = findViewById(R.id.recyclerLand);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        landScapeAdapter = new LandScapeAdapter(this,recylerViewDatas);
        recyclerViewLandScape.setAdapter(landScapeAdapter);

    }
    ArrayList <LandScape> getDataForRecyclerView(){
        ArrayList<LandScape> dsDuLieu= new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("hanoi","Hà Nội");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("nhatrang","Nha Trang"));
        dsDuLieu.add(new LandScape("phuquoc","Phú Quốc"));
        return dsDuLieu;

    }
}