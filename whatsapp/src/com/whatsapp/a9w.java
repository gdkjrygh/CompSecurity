// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.res.Resources;
import android.text.format.DateUtils;
import android.text.format.Formatter;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.whatsapp:
//            App, MediaGallery, bt, MediaGalleryImageView, 
//            a1g

public class a9w extends BaseAdapter
{

    private static final String z;
    private int a;
    final MediaGallery b;
    private SparseArray c;

    public a9w(MediaGallery mediagallery)
    {
        b = mediagallery;
        super();
        a = 0;
        c = new SparseArray();
    }

    private Pair a(int i)
    {
        int k = App.am;
        ArrayList arraylist = null;
        Iterator iterator = MediaGallery.l(b).entrySet().iterator();
        int j;
        do
        {
            j = i;
            if (!iterator.hasNext())
            {
                break;
            }
            ArrayList arraylist1 = (ArrayList)((java.util.Map.Entry)iterator.next()).getValue();
            int l = ((arraylist1.size() + MediaGallery.n(b)) - 1) / MediaGallery.n(b) + 1;
            if (i <= l)
            {
                arraylist = arraylist1;
                j = i;
                if (k == 0)
                {
                    break;
                }
            }
            j = i - l;
            arraylist = arraylist1;
            i = j;
            if (k == 0)
            {
                continue;
            }
            arraylist = arraylist1;
            break;
        } while (true);
        return Pair.create(Integer.valueOf(j - 1), arraylist);
    }

    static SparseArray a(a9w a9w1)
    {
        return a9w1.c;
    }

    public void a()
    {
        int i = App.am;
        a = 0;
        c.clear();
        Iterator iterator = MediaGallery.l(b).entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)iterator.next();
            bt bt1 = (bt)((java.util.Map.Entry) (obj)).getKey();
            obj = (ArrayList)((java.util.Map.Entry) (obj)).getValue();
            c.put(a, bt1);
            int j = a;
            a = ((((ArrayList) (obj)).size() + MediaGallery.n(b)) - 1) / MediaGallery.n(b) + 1 + j;
        } while (i == 0);
        Log.i((new StringBuilder()).append(z).append(a).toString());
    }

    public int getCount()
    {
        if (a == 0)
        {
            a();
        }
        return a;
    }

    public Object getItem(int i)
    {
        return null;
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public int getItemViewType(int i)
    {
        return c.get(i, null) == null ? 0 : 1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int k = App.am;
        if (getItemViewType(i) != 1) goto _L2; else goto _L1
_L1:
        byte byte0;
        if (view != null)
        {
            view = (ViewGroup)view;
            viewgroup = (TextView)view.getChildAt(0);
        } else
        {
            view = (ViewGroup)b.getLayoutInflater().inflate(0x7f03007e, null, true);
            view.setClickable(false);
            viewgroup = (TextView)view.findViewById(0x7f0b022e);
        }
        if (i == 0)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
        viewgroup.setText(((bt)c.get(i)).toString());
        viewgroup = view;
_L4:
        return viewgroup;
_L2:
label0:
        {
label1:
            {
label2:
                {
label3:
                    {
label4:
                        {
label5:
                            {
                                ArrayList arraylist;
                                int l;
                                int i1;
                                if (view != null)
                                {
                                    view = (ViewGroup)view;
                                } else
                                {
                                    view = new LinearLayout(b);
                                    view.setPadding(MediaGallery.a().F, MediaGallery.a().i, 0, MediaGallery.a().i);
                                    view.setClickable(false);
                                }
                                view.setTag(Integer.valueOf(i));
                                l = view.getChildCount();
                                viewgroup = a(i);
                                arraylist = (ArrayList)((Pair) (viewgroup)).second;
                                i1 = ((Integer)((Pair) (viewgroup)).first).intValue();
                                Object obj;
                                c4 c4_1;
                                int j1;
                                for (int j = MediaGallery.n(b) * i1; j >= (i1 + 1) * MediaGallery.n(b); j++)
                                {
                                    break label0;
                                }

                                j1 = j - MediaGallery.n(b) * i1;
                                if (j >= arraylist.size())
                                {
                                    break label2;
                                }
                                c4_1 = (c4)arraylist.get(arraylist.size() - j - 1);
                                if (l <= j1)
                                {
                                    viewgroup = new MediaGalleryImageView(b);
                                    viewgroup.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                                    viewgroup.setTextSize((float)MediaGallery.i(b) / 7F);
                                    viewgroup.setTextGravity(5);
                                    obj = new android.widget.LinearLayout.LayoutParams(MediaGallery.i(b), MediaGallery.i(b));
                                    viewgroup.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                                    obj.rightMargin = (int)MediaGallery.a().j;
                                    view.addView(viewgroup);
                                } else
                                {
                                    viewgroup = (MediaGalleryImageView)view.getChildAt(j1);
                                    viewgroup.setVisibility(0);
                                }
                                if (c4_1.w != 3 && c4_1.w != 2)
                                {
                                    break label4;
                                }
                                if (c4_1.H != 0)
                                {
                                    obj = DateUtils.formatElapsedTime(c4_1.H);
                                    if (k == 0)
                                    {
                                        break label5;
                                    }
                                }
                                obj = Formatter.formatShortFileSize(App.au, c4_1.t);
                            }
label6:
                            {
                                viewgroup.setText(((CharSequence) (obj)));
                                if (c4_1.w == 3)
                                {
                                    viewgroup.setIcon(b.getResources().getDrawable(0x7f02059f));
                                    if (k == 0)
                                    {
                                        break label6;
                                    }
                                }
                                viewgroup.setIcon(null);
                            }
                            if (k == 0)
                            {
                                break label3;
                            }
                        }
                        viewgroup.setText(null);
                        viewgroup.setIcon(null);
                    }
                    viewgroup.setOnClickListener(MediaGallery.j(b));
                    viewgroup.setOnLongClickListener(MediaGallery.o(b));
                    viewgroup.setSelected(MediaGallery.f(b).containsKey(c4_1.y));
                    MediaGallery.a(b, c4_1, i, viewgroup);
                    viewgroup.setTag(c4_1.y);
                    viewgroup.setTag(0x7f0b01b5, c4_1);
                    if (k == 0)
                    {
                        break label1;
                    }
                }
                if (l > j1)
                {
                    viewgroup = (MediaGalleryImageView)view.getChildAt(j1);
                    viewgroup.setVisibility(4);
                    viewgroup.setImageResource(0);
                    viewgroup.setOnClickListener(null);
                    viewgroup.setOnLongClickListener(null);
                }
            }
            if (k == 0)
            {
                break MISSING_BLOCK_LABEL_674;
            }
        }
        i = MediaGallery.n(b);
_L6:
        viewgroup = view;
        if (i >= l) goto _L4; else goto _L3
_L3:
        viewgroup = (MediaGalleryImageView)view.getChildAt(i);
        viewgroup.setVisibility(4);
        viewgroup.setImageResource(0);
        viewgroup.setOnClickListener(null);
        viewgroup.setOnLongClickListener(null);
        viewgroup = view;
        if (k != 0) goto _L4; else goto _L5
_L5:
        i++;
          goto _L6
    }

    public int getViewTypeCount()
    {
        return 2;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = " i4\004/*m<\001+?u\177\037!:,3\002;#xj".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 78;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 77;
          goto _L8
_L3:
        byte0 = 12;
          goto _L8
_L4:
        byte0 = 80;
          goto _L8
        byte0 = 109;
          goto _L8
    }
}
