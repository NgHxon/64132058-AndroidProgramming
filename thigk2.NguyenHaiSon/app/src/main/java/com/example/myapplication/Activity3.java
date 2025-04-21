import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tạo danh sách môn học
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Tin học đại cương");
        subjects.add("lập trình java");
        subjects.add("Phát triển ứng dụng web");
        subjects.add("khai phá dữ liệu lớn");
        subjects.add(" kinh tế chính trị");

        // Ánh xạ ListView
        ListView listView = findViewById(R.id.listView);

        // Adapter để hiển thị dữ liệu
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                subjects
        );

        // Gán adapter vào ListView
        listView.setAdapter(adapter);
    }
}
