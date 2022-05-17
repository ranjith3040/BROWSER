package com.browse.browser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ImageView g,u,f,i,a,w,m,r,fb,maps,t,translater,googleplay,paytm,drive,cricbuzz,similarweb,netflix,pinterest,bing;

    private EditText ed1;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        g=findViewById(R.id.g);
        u=findViewById(R.id.u);
        f=findViewById(R.id.f);
        i=findViewById(R.id.i);
        a=findViewById(R.id.a);
        w=findViewById(R.id.w);
        m=findViewById(R.id.m);
        r=findViewById(R.id.r);
        fb=findViewById(R.id.fb);
        maps=findViewById(R.id.map);
        t=findViewById(R.id.t);
        translater=findViewById(R.id.translate);
        googleplay=findViewById(R.id.googleplay);
        paytm=findViewById(R.id.paytm);
        drive=findViewById(R.id.drive);
        cricbuzz=findViewById(R.id.cricbuzz);
        similarweb=findViewById(R.id.similarweb);
        netflix=findViewById(R.id.netflix);
        pinterest=findViewById(R.id.pinterest);
        bing=findViewById(R.id.bing);
        ed1=findViewById(R.id.txt);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link=ed1.getText().toString();
                if(TextUtils.isEmpty(link))
                {
                    Toast.makeText(MainActivity.this,"Enter Valid URL",Toast.LENGTH_LONG).show();

                }
                else
                {
                    Intent intent=new Intent(MainActivity.this,Webpage.class);
                    intent.putExtra("message",link);
                    startActivity(intent);

                }
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
                startActivity(i);
            }
        });
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"));
                startActivity(i);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.flipkart.com/"));
                startActivity(i);
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/?hl=en"));
                startActivity(i);
            }
        });
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72705283629710&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_7qhce485bd_e"));
                startActivity(i);
            }
        });
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.wikipedia.org/"));
                startActivity(i);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/intl/en-GB/gmail/about/"));
                startActivity(i);
            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.reddit.com/qwk"));
                startActivity(i);
            }
        });
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/"));
                startActivity(i);
            }
        });
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.co.in/maps/@10.7828364,78.2885026,7z"));
                startActivity(i);
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://twitter.com/?lang=en-in"));
                startActivity(i);
            }
        });
        translater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://translate.google.com/"));
                startActivity(i);
            }
        });
        googleplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://play.google.com/store"));
                startActivity(i);
            }
        });
        paytm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://paytm.com/"));
                startActivity(i);
            }
        });
        drive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://accounts.google.com/AccountChooser/identifier?service=writely&flowName=GlifWebSignIn&flowEntry=AccountChooser"));
                startActivity(i);
            }

        });
        cricbuzz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.cricbuzz.com/"));
                startActivity(i);
            }
        });
        similarweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.similarweb.com/website/live.com/"));
                startActivity(i);
            }
        });
        netflix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.netflix.com/in/"));
                startActivity(i);
            }
        });
        pinterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://in.pinterest.com/login/"));
                startActivity(i);
            }
        });
        bing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.bing.com/?toWww=1&redig=17032D6B89D44866942130F89C1057AF"));
                startActivity(i);
            }
        });

    }
}