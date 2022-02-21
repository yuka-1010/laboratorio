package com.example.promedio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText p1, p2, p3;
    private EditText f1, f2, f3;
    private EditText q1, q2, q3;
    private EditText i1, i2, i3;
    private EditText o1, o2, o3;
    private EditText m1, m2, m3;
    private EditText s1, s2, s3;
    private EditText is1, is2, is3;
    private EditText l1, l2, l3;
    private EditText pin1, pin2, pin3;
    private TextView resul1, resul2, resul3, total, extra1, extra2, extra3, extra4, extra5, extra6, extra7, extra8, extra9, extra10;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p1=(EditText)findViewById(R.id.pye1);
        p2=(EditText)findViewById(R.id.pye2);
        p3=(EditText)findViewById(R.id.pye3);
        f1=(EditText)findViewById(R.id.fis1);
        f2=(EditText)findViewById(R.id.fis2);
        f3=(EditText)findViewById(R.id.fis3);
        q1=(EditText)findViewById(R.id.qui1);
        q2=(EditText)findViewById(R.id.qui2);
        q3=(EditText)findViewById(R.id.qui3);
        i1=(EditText)findViewById(R.id.ing1);
        i2=(EditText)findViewById(R.id.ing2);
        i3=(EditText)findViewById(R.id.ing3);
        o1=(EditText)findViewById(R.id.ojyp1);
        o2=(EditText)findViewById(R.id.ojyp2);
        o3=(EditText)findViewById(R.id.ojyp3);
        m1=(EditText)findViewById(R.id.ma1);
        m2=(EditText)findViewById(R.id.ma2);
        m3=(EditText)findViewById(R.id.ma3);
        s1=(EditText)findViewById(R.id.soso1);
        s2=(EditText)findViewById(R.id.soso2);
        s3=(EditText)findViewById(R.id.soso3);
        is1=(EditText)findViewById(R.id.ingsoft1);
        is2=(EditText)findViewById(R.id.ingsoft2);
        is3=(EditText)findViewById(R.id.ingsoft3);
        l1=(EditText)findViewById(R.id.lpti1);
        l2=(EditText)findViewById(R.id.lpti2);
        l3=(EditText)findViewById(R.id.lpti3);
        pin1=(EditText)findViewById(R.id.pi1);
        pin2=(EditText)findViewById(R.id.pi2);
        pin3=(EditText)findViewById(R.id.pi3);
        resul1=(TextView)findViewById(R.id.resul1);
        resul2=(TextView)findViewById(R.id.resul2);
        resul3=(TextView)findViewById(R.id.resul3);
        total=(TextView)findViewById(R.id.total);
        extra1=(TextView)findViewById(R.id.extra1);
        extra2=(TextView)findViewById(R.id.extra2);
        extra3=(TextView)findViewById(R.id.extra3);
        extra4=(TextView)findViewById(R.id.extra4);
        extra5=(TextView)findViewById(R.id.extra5);
        extra6=(TextView)findViewById(R.id.extra6);
        extra7=(TextView)findViewById(R.id.extra7);
        extra8=(TextView)findViewById(R.id.extra8);
        extra9=(TextView)findViewById(R.id.extra9);
        extra10=(TextView)findViewById(R.id.extra10);


    }
    public void calcular (View view) {
        String pye1_String = p1.getText().toString();
        String pye2_String = p2.getText().toString();
        String pye3_String = p3.getText().toString();
        String fis1_String = f1.getText().toString();
        String fis2_String = f2.getText().toString();
        String fis3_String = f3.getText().toString();
        String qui1_String = q1.getText().toString();
        String qui2_String = q2.getText().toString();
        String qui3_String = q3.getText().toString();
        String ing1_String = i1.getText().toString();
        String ing2_String = i2.getText().toString();
        String ing3_String = i3.getText().toString();
        String ojyp1_String = o1.getText().toString();
        String ojyp2_String = o2.getText().toString();
        String ojyp3_String = o3.getText().toString();
        String ma1_String = m1.getText().toString();
        String ma2_String = m2.getText().toString();
        String ma3_String = m3.getText().toString();
        String soso1_String = s1.getText().toString();
        String soso2_String = s2.getText().toString();
        String soso3_String = s3.getText().toString();
        String ingsoft1_String = is1.getText().toString();
        String ingsoft2_String = is2.getText().toString();
        String ingsoft3_String = is3.getText().toString();
        String lpti1_String = l1.getText().toString();
        String lpti2_String = l2.getText().toString();
        String lpti3_String = l3.getText().toString();
        String pi1_String = pin1.getText().toString();
        String pi2_String = pin2.getText().toString();
        String pi3_String = pin3.getText().toString();

        int pye1_int = Integer.parseInt(pye1_String);
        int pye2_int = Integer.parseInt(pye2_String);
        int pye3_int = Integer.parseInt(pye3_String);
        int fis1_int = Integer.parseInt(fis1_String);
        int fis2_int = Integer.parseInt(fis2_String);
        int fis3_int = Integer.parseInt(fis3_String);
        int qui1_int = Integer.parseInt(qui1_String);
        int qui2_int = Integer.parseInt(qui2_String);
        int qui3_int = Integer.parseInt(qui3_String);
        int ing1_int = Integer.parseInt(ing1_String);
        int ing2_int = Integer.parseInt(ing2_String);
        int ing3_int = Integer.parseInt(ing3_String);
        int ojyp1_int = Integer.parseInt(ojyp1_String);
        int ojyp2_int = Integer.parseInt(ojyp2_String);
        int ojyp3_int = Integer.parseInt(ojyp3_String);
        int ma1_int = Integer.parseInt(ma1_String);
        int ma2_int = Integer.parseInt(ma2_String);
        int ma3_int = Integer.parseInt(ma3_String);
        int soso1_int = Integer.parseInt(soso1_String);
        int soso2_int = Integer.parseInt(soso2_String);
        int soso3_int = Integer.parseInt(soso3_String);
        int ingsoft1_int = Integer.parseInt(ingsoft1_String);
        int ingsoft2_int = Integer.parseInt(ingsoft2_String);
        int ingsoft3_int = Integer.parseInt(ingsoft3_String);
        int lpti1_int = Integer.parseInt(lpti1_String);
        int lpti2_int = Integer.parseInt(lpti2_String);
        int lpti3_int = Integer.parseInt(lpti3_String);
        int pi1_int = Integer.parseInt(pi1_String);
        int pi2_int = Integer.parseInt(pi2_String);
        int pi3_int = Integer.parseInt(pi3_String);


        int p1 = (pye1_int+fis1_int+qui1_int+ing1_int+ojyp1_int+ma1_int+soso1_int+ingsoft1_int+lpti1_int+pi1_int)/10;
        resul1.setText("Primer parcial: " + p1);

        int p2 = (pye2_int+fis2_int+qui2_int+ing2_int+ojyp2_int+ma2_int+soso2_int+ingsoft2_int+lpti2_int+pi2_int)/10;
        resul2.setText("Segundo parcial: " + p2);

        int p3 = (pye3_int+fis3_int+qui3_int+ing3_int+ojyp3_int+ma3_int+soso3_int+ingsoft3_int+lpti3_int+pi3_int)/10;
        resul3.setText("Tercer parcial: " + p3);

        int t = (p1+p2+p3)/3;
        total.setText("Promedio general: " + t);

        int pp = (pye1_int+pye2_int+pye3_int)/3;
        int fp = (fis1_int+fis2_int+fis3_int)/3;
        int qp = (qui1_int+qui2_int+qui3_int)/3;
        int ip = (ing1_int+ing2_int+ing3_int)/3;
        int op = (ojyp1_int+ojyp2_int+ojyp3_int)/3;
        int mp = (ma1_int+ma2_int+ma3_int)/3;
        int sp = (soso1_int+soso2_int+soso3_int)/3;
        int isp = (ingsoft1_int+ingsoft2_int+ingsoft3_int)/3;
        int lp = (lpti1_int+lpti2_int+lpti3_int)/3;
        int pip = (pi1_int+pi2_int+pi3_int)/3;

        if (pp < 5){
            extra1.setText("E");
        }else if(pp >= 6){
            extra1.setText("NP");
        }

        if(fp < 5){
            extra2.setText("E");
        }else if(fp >= 6){
            extra2.setText("NP");
        }

        if(qp < 5){
            extra3.setText("E");
        }else if(qp >= 6){
            extra3.setText("NP");
        }

        if(ip < 5){
            extra4.setText("E");
        }else if(ip >= 6){
            extra4.setText("NP");
        }

        if(op < 5){
            extra5.setText("E");
        }else if(op >= 6){
            extra5.setText("NP");
        }

        if(mp < 5){
            extra6.setText("E");
        }else if(mp >= 6){
            extra6.setText("NP");
        }

        if(sp < 5){
            extra7.setText("E");
        }else if(sp >= 6){
            extra7.setText("NP");
        }
        if(isp < 5){
            extra8.setText("E");
        }else if(isp >= 6){
            extra8.setText("NP");
        }
        if(lp < 5){
            extra9.setText("E");
        }else if(lp >= 6){
            extra9.setText("NP");
        }
        if(pip < 5){
            extra10.setText("E");
        }else if(pip >= 6){
            extra10.setText("NP");
        }

    }
}