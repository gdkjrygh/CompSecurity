// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, App, UserFeedbackActivity, lx, 
//            l0

public class SystemStatusActivity extends DialogToastActivity
{

    private static final String z[];
    private ArrayList j;
    private int k;
    private String l;
    private boolean m;
    private final List n;
    private boolean o;
    private boolean p;
    private String q;

    public SystemStatusActivity()
    {
        n = Arrays.asList(new String[] {
            z[33], z[34], z[32], z[31]
        });
    }

    static String a(SystemStatusActivity systemstatusactivity)
    {
        return systemstatusactivity.q;
    }

    public static void a(Context context, String s, Integer integer, boolean flag, boolean flag1, ArrayList arraylist, boolean flag2)
    {
        Intent intent = new Intent(context, com/whatsapp/SystemStatusActivity);
        intent.putExtra(z[4], s);
        intent.putExtra(z[1], flag);
        intent.putExtra(z[5], flag1);
        intent.putStringArrayListExtra(z[2], arraylist);
        intent.putExtra(z[0], flag2);
        if (integer != null)
        {
            intent.putExtra(z[3], integer);
        }
        context.startActivity(intent);
    }

    static String b(SystemStatusActivity systemstatusactivity)
    {
        return systemstatusactivity.l;
    }

    static int c(SystemStatusActivity systemstatusactivity)
    {
        return systemstatusactivity.k;
    }

    public void onCreate(Bundle bundle)
    {
        int i2;
        boolean flag;
        i2 = App.am;
        Log.i(z[22]);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        setContentView(0x7f0300a8);
        bundle = getIntent();
        l = bundle.getStringExtra(z[6]);
        k = bundle.getIntExtra(z[9], 0);
        getSupportActionBar().setTitle(0x7f0e0432);
        p = bundle.getBooleanExtra(z[15], true);
        m = bundle.getBooleanExtra(z[16], true);
        o = bundle.getBooleanExtra(z[25], false);
        j = bundle.getStringArrayListExtra(z[30]);
        flag = j.remove(z[23]);
        if (m) goto _L2; else goto _L1
_L1:
        Bundle bundle1;
        int i;
        if (App.u == 2)
        {
            bundle = getString(0x7f0e032e);
        } else
        if (App.u == 0)
        {
            bundle = getString(0x7f0e032f);
        } else
        {
            bundle = getString(0x7f0e0330, new Object[] {
                z[21]
            });
        }
        if (p)
        {
            i = 0x7f0e0434;
        } else
        {
            i = 0x7f0e0433;
        }
        bundle = getString(i, new Object[] {
            bundle
        });
_L7:
label0:
        {
            bundle1 = bundle;
            if (bundle != null)
            {
                break label0;
            }
            if (o)
            {
                bundle = getString(0x7f0e03b5);
                bundle1 = bundle;
                if (i2 == 0)
                {
                    break label0;
                }
            }
            UserFeedbackActivity.a(this, l, q, Integer.valueOf(k));
            finish();
            bundle1 = bundle;
        }
label1:
        {
            ((TextView)findViewById(0x7f0b029a)).setText(bundle1);
            if (!o && p)
            {
                if (q == null)
                {
                    q = (new StringBuilder()).append("+").append(TextUtils.join("+", j)).toString();
                    if (!m)
                    {
                        q = (new StringBuilder()).append(q).append(z[13]).toString();
                    }
                }
                bundle = new lx(this);
                ((Button)findViewById(0x7f0b029d)).setOnClickListener(bundle);
                ((Button)findViewById(0x7f0b029e)).setOnClickListener(new l0(this));
                if (i2 == 0)
                {
                    break label1;
                }
            }
            findViewById(0x7f0b029b).setVisibility(8);
        }
        return;
_L2:
        if (k == 1) goto _L4; else goto _L3
_L3:
        if (!flag) goto _L6; else goto _L5
_L5:
label2:
        {
            if (p)
            {
                break label2;
            }
            bundle = (new StringBuilder()).append(getString(0x7f0e042b)).append(" ");
            int i1;
            if (n.contains(z[28]))
            {
                i1 = 0x7f0e0413;
            } else
            {
                i1 = 0x7f0e0411;
            }
            bundle = bundle.append(getString(i1)).toString();
        }
          goto _L7
        q = z[8];
        if (i2 == 0) goto _L6; else goto _L4
_L4:
label3:
        {
            if (!j.contains(z[11]))
            {
                break label3;
            }
            int j1;
            if (p)
            {
                j1 = 0x7f0e0410;
            } else
            {
                j1 = 0x7f0e040f;
            }
            bundle = getString(j1);
        }
          goto _L7
        if (j.size() <= 0) goto _L6; else goto _L8
_L8:
        String s;
        Iterator iterator;
        int k1;
        bundle = "";
        k1 = 0;
        s = null;
        iterator = j.iterator();
_L10:
        String s2;
        Object obj;
        int l1;
        s2 = s;
        l1 = k1;
        obj = bundle;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = (String)iterator.next();
        int j2 = getResources().getIdentifier((new StringBuilder()).append(z[19]).append(s2).append(z[20]).toString(), z[18], getPackageName());
        l1 = k1;
        obj = bundle;
        if (j2 != 0)
        {
            obj = (new StringBuilder()).append(bundle).append(z[17]).append(getString(j2)).append("\n").toString();
            k1++;
            if (i2 == 0)
            {
                break MISSING_BLOCK_LABEL_1188;
            }
            s = s2;
            l1 = k1;
        }
        Log.e((new StringBuilder()).append(z[12]).append(s2).toString());
        s2 = s;
_L12:
        s = s2;
        k1 = l1;
        bundle = ((Bundle) (obj));
        if (i2 == 0) goto _L10; else goto _L9
_L9:
label4:
        {
            if (l1 <= 1)
            {
                break label4;
            }
            bundle = (new StringBuilder()).append(((String) (obj))).append("\n").toString();
            if (p)
            {
                bundle = (new StringBuilder()).append(getString(0x7f0e041f)).append(z[14]).append(bundle).append(getString(0x7f0e0421)).toString();
            } else
            {
                bundle = (new StringBuilder()).append(getString(0x7f0e041e)).append(z[10]).append(bundle).append(getString(0x7f0e0420)).toString();
            }
        }
          goto _L7
        if (l1 <= 0) goto _L6; else goto _L11
_L11:
label5:
        {
            String s1 = getPackageName();
            StringBuilder stringbuilder = (new StringBuilder()).append(z[24]).append(s2).append(z[26]);
            if (p)
            {
                bundle = z[29];
            } else
            {
                bundle = "";
            }
            bundle = stringbuilder.append(bundle).toString();
            k1 = getResources().getIdentifier(bundle, z[7], s1);
            if (k1 == 0)
            {
                break label5;
            }
            bundle = (new StringBuilder()).append(getString(k1)).append(" ");
            if (p)
            {
                k1 = 0x7f0e0412;
            } else
            if (n.contains(s2))
            {
                k1 = 0x7f0e0413;
            } else
            {
                k1 = 0x7f0e0411;
            }
            bundle = bundle.append(getString(k1)).toString();
        }
          goto _L7
        Log.e((new StringBuilder()).append(z[27]).append((String)j.get(0)).toString());
_L6:
        bundle = null;
          goto _L7
        l1 = k1;
          goto _L12
    }

    public void onDestroy()
    {
        super.onDestroy();
        Log.i(z[37]);
    }

    public void onPause()
    {
        super.onPause();
        Log.i(z[35]);
    }

    public void onResume()
    {
        super.onResume();
        Log.i(z[36]);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[38];
        obj = "Z\013&'mQ\005?z{I\024eZcJ\020.dIM\005?|ix\007?`lP\0202'iM\005?|iV\n'p";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int i1;
        int j1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        j1 = obj.length;
        i1 = 0;
_L8:
label0:
        {
            if (j1 > i1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "Z\013&'mQ\005?z{I\024eZcJ\020.dIM\005?|ix\007?`lP\0202'\177T\005\"e";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "Z\013&'mQ\005?z{I\024eZcJ\020.dIM\005?|ix\007?`lP\0202'i\\\026=lh_\001*}oK\0018|tX\022*`vX\006'l";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "Z\013&'mQ\005?z{I\024eZcJ\020.dIM\005?|ix\007?`lP\0202'n@\024.";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "Z\013&'mQ\005?z{I\024eZcJ\020.dIM\005?|ix\007?`lP\0202'|K\013&";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "Z\013&'mQ\005?z{I\024eZcJ\020.dIM\005?|ix\007?`lP\0202'l\\\0268`uW";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "Z\013&'mQ\005?z{I\024eZcJ\020.dIM\005?|ix\007?`lP\0202'|K\013&";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "J\0209`t^";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "K\001,`iM\026*}sV\n";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                obj = "Z\013&'mQ\005?z{I\024eZcJ\020.dIM\005?|ix\007?`lP\0202'n@\024.";
                byte0 = 8;
                i = 9;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "3n";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "Z\f*}";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "J\0358znX\020>z5Z\026.hn\\K&$~V\023%&iM\026\"g}\024\n$}7_\013>g~\031";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\022\022.{iP\013%";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "3n";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "Z\013&'mQ\005?z{I\024eZcJ\020.dIM\005?|ix\007?`lP\0202'\177T\005\"e";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "Z\013&'mQ\005?z{I\024eZcJ\020.dIM\005?|ix\007?`lP\0202'l\\\0268`uW";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "\031D\u2069)";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "J\0209`t^";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "J\0358}\177T;8}{M\0218V";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "f\002.hnL\026.";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "Q\020?yi\003Kd~rX\0208hjIJ(fw\026\005%mhV\r/";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "J\0358znX\020>z5Z\026.hn\\";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "K\001,`iM\026*}sV\n";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "J\0358}\177T;8}{M\0218V";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "Z\013&'mQ\005?z{I\024eZcJ\020.dIM\005?|ix\007?`lP\0202'iM\005?|iV\n'p";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                obj = "f\000.zyK\r;}sV\n";
                byte0 = 25;
                i = 26;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "J\0358znX\020>z5Z\026.hn\\K/fmWK8}hP\n,$tV\020fouL\n/)";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "K\001,`iM\026*}sV\n";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "f\026.j\177W\020'p";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "Z\013&'mQ\005?z{I\024eZcJ\020.dIM\005?|ix\007?`lP\0202'i\\\026=lh_\001*}oK\0018|tX\022*`vX\006'l";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "J\020*}oJ";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "J\035%j";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "[\026$h~Z\0058}";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 34;
                obj = "K\001,`iM\026*}sV\n";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "J\0358znX\020>z5I\005>z\177";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i] = ((String) (obj));
                i = 36;
                obj = "J\0358znX\020>z5K\0018|w\\";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i] = ((String) (obj));
                i = 37;
                obj = "J\0358znX\020>z5]\0018}hV\035";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 916
    //                   0 939
    //                   1 946
    //                   2 953
    //                   3 960;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_960;
_L3:
        byte byte1 = 26;
_L9:
        obj[i1] = (char)(byte1 ^ c1);
        i1++;
          goto _L8
_L4:
        byte1 = 57;
          goto _L9
_L5:
        byte1 = 100;
          goto _L9
_L6:
        byte1 = 75;
          goto _L9
        byte1 = 9;
          goto _L9
    }
}
