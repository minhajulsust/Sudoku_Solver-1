package comviewmworkstation.google.sites.sudokusolver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

import static android.R.attr.width;
import static android.support.v7.appcompat.R.attr.controlBackground;
import static android.support.v7.appcompat.R.attr.height;

public class SudokuBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_sudoku_board);





        GridLayout boardLayout = new GridLayout(this);
        boardLayout = (GridLayout) findViewById(R.id.board);
        Button [][]exitTex = new  Button[10][10];
        for(int i=1;i<=9;i++) {
            for(int j=1;j<=9;j++) {
                exitTex[i][j] = new  Button(this);

                exitTex[i][j].setHeight(2);
                exitTex[i][j].setWidth(2);
                exitTex[i][j].setText("");

                boardLayout.addView(exitTex[i][j]);
            }
        }

    }


}
