package com.example.scientificcalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //initializing all buttons
    Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,
            btn_6,btn_7,btn_8,btn_9,btn_ac,btn_bc,
            btn_B1,btn_B2,btn_sin,btn_cos,btn_tan,btn_log,btn_ln,btn_factor,
            btn_sqare,btn_root,btn_inverse,btn_div,btn_mul,btn_add,btn_min,btn_equal,
            btn_dot,btn_pie;

    TextView tv_sec,tv_main;

    String pie = "3.14159265";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_B1 = findViewById(R.id.btn_B1);
        btn_B2 = findViewById(R.id.btn_B2);
        btn_ac = findViewById(R.id.btn_ac);
        btn_bc = findViewById(R.id.btn_bc);
        btn_sin = findViewById(R.id.btn_sin);
        btn_cos = findViewById(R.id.btn_cos);
        btn_tan = findViewById(R.id.btn_tan);
        btn_log = findViewById(R.id.btn_log);
        btn_ln = findViewById(R.id.btn_ln);
        btn_factor = findViewById(R.id.btn_factor);
        btn_dot = findViewById(R.id.btn_dot);
        btn_pie = findViewById(R.id.btn_pie);
        btn_root = findViewById(R.id.btn_root);
        btn_sqare = findViewById(R.id.btn_square);
        btn_div = findViewById(R.id.btn_div);
        btn_mul = findViewById(R.id.btn_mul);
        btn_add = findViewById(R.id.btn_add);
        btn_min = findViewById(R.id.btn_min);
        btn_inverse = findViewById(R.id.btn_inverse);
        btn_equal = findViewById(R.id.btn_equal);

        tv_sec = findViewById(R.id.tv_sec);
        tv_main = findViewById(R.id.tv_main);

        //adding onclick_listener
       btn_1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                tv_main.setText(tv_main.getText()+"1");
           }
       });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText()+"2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText()+"3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText()+"4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText()+"5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText()+"6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText()+"7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText()+"8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText()+"9");
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText()+"0");
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText()+".");
            }
        });

        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText("");
                tv_sec.setText("");
            }
        });

        btn_bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = tv_main.getText().toString();
                val = val.substring(0, val.length() - 1);
                tv_main.setText(val);

            }
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText()+"+");
            }
        });

        btn_min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText()+"-");
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText()+"×");
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText()+"÷");
            }
        });

        btn_sqare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = tv_main.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                tv_main.setText(String.valueOf(r));

            }
        });

        btn_B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText()+"(" );
            }
        });

        btn_B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText()+")");
            }
        });

        btn_pie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_sec.setText(btn_pie.getText());
                tv_main.setText(tv_main.getText()+pie);

            }
        });

        btn_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText()+"sin");

            }
        });

        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText()+"cos");

            }
        });

        btn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText()+"tan");

            }
        });

        btn_inverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv_main.setText(tv_main.getText()+"^"+"(-1)");

            }
        });

        btn_factor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val = Integer.parseInt(tv_main.getText().toString());
                int fact = factorial(val);
                tv_main.setText(String.valueOf(fact));
                tv_sec.setText(val+"!");
            }
        });

        btn_sqare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double d = Double.parseDouble(tv_main.getText().toString());
                double square =  d*d;
                tv_main.setText(String.valueOf(square));
                tv_sec.setText(d+"²");
            }
        });

        btn_ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText()+"ln");
            }
        });

        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText()+"log");
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = tv_main.getText().toString();
                String replacedstr = val.replace('÷','/').replace('×','*');
                double result = eval(replacedstr);
                tv_main.setText(String.valueOf(result));
                tv_sec.setText(val);
            }
        });



    }

    //creating factorial function
    int factorial(int n)
    {
        return (n==1 || n==0) ? 1 : n*factorial(n-1);
    }

    //eval function
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }
            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}