// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import a;
import android.backport.util.Base64;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b;
import c;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import com.whatsapp.util.x;
import d;
import g;
import i;
import j;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l;
import o;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, App, iz, h9, 
//            k, og, dh, t7, 
//            abb, oe, j1, s1, 
//            q6, nq, d0, l5

public class ViewSharedContactActivity extends DialogToastActivity
{

    private static final String z[];
    private String j;
    private String k;
    private boolean l;
    private Bitmap m;
    private g n;
    private LinearLayout o;
    private String p;
    private boolean q;

    public ViewSharedContactActivity()
    {
        n = null;
        l = false;
        m = null;
        q = false;
    }

    private RelativeLayout a(c c1)
    {
        int i1 = App.am;
        RelativeLayout relativelayout = (RelativeLayout)iz.a((LayoutInflater)getSystemService(z[78]), 0x7f0300af, null, true);
        TextView textview;
        Object aobj[];
        int k1;
        boolean flag;
        try
        {
            relativelayout.setOnClickListener(new h9(this, c1));
            relativelayout.setTag(c1.a);
            relativelayout.setClickable(true);
            relativelayout.setFocusable(true);
            relativelayout.setBackgroundDrawable(getResources().getDrawable(0x7f02063d));
            if (q)
            {
                relativelayout.findViewById(0x7f0b02c7).setVisibility(0);
            }
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            throw c1;
        }
        textview = (TextView)relativelayout.findViewById(0x7f0b02c8);
        flag = g.j.containsKey(c1.b);
        if (flag)
        {
            try
            {
                textview.setText(getString(0x7f0e008d, new Object[] {
                    g.b.get(c1.b)
                }));
            }
            // Misplaced declaration of an exception variable
            catch (c c1)
            {
                throw c1;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_254;
            }
        }
        flag = c1.b.equals(z[79]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_237;
        }
        aobj = c1.e.toArray();
        if (aobj == null)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        k1 = aobj.length;
        if (k1 > 0)
        {
            try
            {
                textview.setText((String)c1.e.toArray()[0]);
            }
            // Misplaced declaration of an exception variable
            catch (c c1)
            {
                throw c1;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_232;
            }
        }
        textview.setText(getResources().getString(0x7f0e0483));
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        try
        {
            textview.setText((CharSequence)g.b.get(c1.b));
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            throw c1;
        }
        textview = (TextView)relativelayout.findViewById(0x7f0b02ca);
        textview.setWidth(300);
        textview.setMaxLines(2);
        textview.setText(c1.a);
        relativelayout.findViewById(0x7f0b02c9).setVisibility(8);
        return relativelayout;
        c1;
        throw c1;
        c1;
        throw c1;
    }

    private RelativeLayout a(d d1, int i1)
    {
        Object obj;
label0:
        {
            RelativeLayout relativelayout = (RelativeLayout)iz.a((LayoutInflater)getSystemService(z[77]), 0x7f0300af, null, true);
            TextView textview;
            StringBuilder stringbuilder;
            try
            {
                relativelayout.setTag(d1.a);
                relativelayout.setClickable(true);
                relativelayout.setFocusable(true);
                relativelayout.setBackgroundDrawable(getResources().getDrawable(0x7f02063d));
                if (q)
                {
                    relativelayout.findViewById(0x7f0b02c7).setVisibility(0);
                }
            }
            // Misplaced declaration of an exception variable
            catch (d d1)
            {
                throw d1;
            }
            textview = (TextView)relativelayout.findViewById(0x7f0b02c8);
            try
            {
                stringbuilder = (new StringBuilder()).append(getResources().getString(0x7f0e047a)).append(" ");
                if (d1.e != 0)
                {
                    break label0;
                }
                obj = d1.b;
            }
            // Misplaced declaration of an exception variable
            catch (d d1)
            {
                throw d1;
            }
        }
_L1:
        textview.setText(stringbuilder.append(((String) (obj))).append(" ").append(getResources().getString(0x7f0e0031)).toString());
        obj = (TextView)relativelayout.findViewById(0x7f0b02ca);
        try
        {
            ((TextView) (obj)).setWidth(300);
            ((TextView) (obj)).setMaxLines(3);
            if (d1.c != null)
            {
                ((TextView) (obj)).setText(d1.c.a());
            }
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            throw d1;
        }
        ((ImageView)relativelayout.findViewById(0x7f0b02c9)).setBackgroundResource(i1);
        return relativelayout;
        obj = a(android/provider/ContactsContract$CommonDataKinds$StructuredPostal, d1.e);
          goto _L1
    }

    private RelativeLayout a(String s, String s2, int i1, String s3)
    {
        RelativeLayout relativelayout = (RelativeLayout)iz.a((LayoutInflater)getSystemService(z[90]), 0x7f0300af, null, true);
        try
        {
            relativelayout.setTag(s3);
            relativelayout.setClickable(true);
            relativelayout.setFocusable(true);
            relativelayout.setBackgroundDrawable(getResources().getDrawable(0x7f02063d));
            if (q)
            {
                relativelayout.findViewById(0x7f0b02c7).setVisibility(0);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        ((TextView)relativelayout.findViewById(0x7f0b02c8)).setText(s);
        s = (TextView)relativelayout.findViewById(0x7f0b02ca);
        try
        {
            s.setWidth(300);
            s.setMaxLines(2);
            if (!s2.equalsIgnoreCase(z[89]))
            {
                s.setText(s2);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        ((ImageView)relativelayout.findViewById(0x7f0b02c9)).setBackgroundResource(i1);
        return relativelayout;
    }

    private g a(String s)
    {
        s = g.i(s);
        return s;
        s;
        Log.c(s);
_L2:
        return null;
        s;
        Log.a(s);
        continue; /* Loop/switch isn't completed */
        s;
        Log.c(s);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private String a(Class class1, int i1)
    {
        try
        {
            class1 = class1.getMethod(z[88], new Class[] {
                Integer.TYPE
            });
            class1 = App.au.getString(((Integer)class1.invoke(null, new Object[] {
                Integer.valueOf(i1)
            })).intValue());
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            Log.a(class1);
            return null;
        }
        return class1;
    }

    private void a(View view)
    {
        view = (CheckBox)view.findViewById(0x7f0b02c7);
        boolean flag;
        try
        {
            flag = view.isChecked();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            try
            {
                throw view;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        view.setChecked(false);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        view.setChecked(true);
        return;
    }

    static void a(ViewSharedContactActivity viewsharedcontactactivity, View view)
    {
        viewsharedcontactactivity.a(view);
    }

    private void a(String s, String s2, String s3)
    {
        ((TextView)findViewById(0x7f0b0135)).setText(s);
        s = (TextView)findViewById(0x7f0b018f);
        boolean flag;
        try
        {
            flag = TextUtils.isEmpty(s2);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        s.setVisibility(8);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        s.setText(s2);
        s.setVisibility(0);
        return;
    }

    static boolean a(ViewSharedContactActivity viewsharedcontactactivity)
    {
        return viewsharedcontactactivity.q;
    }

    private void b()
    {
        int i1;
        int k1;
        k1 = App.am;
        i1 = 0;
_L2:
        Object obj;
        CheckBox checkbox;
        if (i1 >= o.getChildCount())
        {
            break MISSING_BLOCK_LABEL_327;
        }
        obj = o.getChildAt(i1);
        checkbox = (CheckBox)((View) (obj)).findViewById(0x7f0b02c7);
        boolean flag;
        if (checkbox.isChecked())
        {
            break MISSING_BLOCK_LABEL_322;
        }
        Log.e((new StringBuilder()).append(z[4]).append(i1).toString());
        flag = ((View) (obj)).getTag() instanceof String;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        Log.e((new StringBuilder()).append(z[0]).append(((View) (obj)).getTag().toString()).toString());
        n.l.remove(((View) (obj)).getTag().toString());
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        l l1;
        Object obj1;
        boolean flag1;
        try
        {
            flag1 = ((View) (obj)).getTag() instanceof d;
        }
        catch (l l2)
        {
            throw l2;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_263;
        }
        obj1 = (d)((View) (obj)).getTag();
        n.i.remove(obj1);
        if (((d) (obj1)).d != android/provider/ContactsContract$CommonDataKinds$Email)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        Log.e((new StringBuilder()).append(z[2]).append(((View) (obj)).getTag()).toString());
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        obj1 = ((d) (obj1)).d;
        if (obj1 == android/provider/ContactsContract$CommonDataKinds$StructuredPostal)
        {
            try
            {
                Log.e((new StringBuilder()).append(z[3]).append(((View) (obj)).getTag()).toString());
            }
            // Misplaced declaration of an exception variable
            catch (l l3)
            {
                throw l3;
            }
        }
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        flag1 = ((View) (obj)).getTag() instanceof a;
        if (flag1)
        {
            try
            {
                n.g.remove(((View) (obj)).getTag());
                Log.e((new StringBuilder()).append(z[1]).append(((View) (obj)).getTag()).toString());
            }
            catch (l l4)
            {
                throw l4;
            }
        }
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_411;
        }
        obj = new o();
        l l3;
        try
        {
            obj = ((o) (obj)).a(this, n, 2);
            App.a(k, n.f.a, ((String) (obj)));
            setResult(-1);
            finish();
            return;
        }
        catch (l l6)
        {
            Log.a(l6);
        }
        break MISSING_BLOCK_LABEL_403;
        l1;
        throw l1;
        l1;
        throw l1;
        l3;
        throw l3;
        l3;
        throw l3;
        l3;
        throw l3;
        a(0x7f0e0280);
        return;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static void b(ViewSharedContactActivity viewsharedcontactactivity)
    {
        viewsharedcontactactivity.d();
    }

    static void c(ViewSharedContactActivity viewsharedcontactactivity)
    {
        viewsharedcontactactivity.b();
    }

    private void d()
    {
        boolean flag;
        try
        {
            flag = l;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            try
            {
                throw illegalargumentexception;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        f(getString(0x7f0e00cb, new Object[] {
            n.a()
        }));
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        a();
        l = true;
        return;
    }

    protected void a()
    {
        boolean flag;
        int k1 = App.am;
        Object obj1 = new ArrayList();
        android.content.ContentProviderOperation.Builder builder = ContentProviderOperation.newInsert(android.provider.ContactsContract.RawContacts.CONTENT_URI);
        builder.withValue(z[38], null);
        builder.withValue(z[43], null);
        ((ArrayList) (obj1)).add(builder.build());
        builder = ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI);
        builder.withValueBackReference(z[23], 0);
        builder.withValue(z[51], z[26]);
        builder.withValue(z[46], n.f.a);
        builder.withValue(z[6], n.f.h);
        builder.withValue(z[54], n.f.b);
        builder.withValue(z[20], n.f.e);
        builder.withValue(z[15], n.f.d);
        builder.withValue(z[9], n.f.f);
        builder.withValue(z[64], n.f.g);
        builder.withValue(z[5], n.f.c);
        ((ArrayList) (obj1)).add(builder.build());
        if (n.g != null)
        {
            Iterator iterator = n.g.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj2 = (a)iterator.next();
                Object obj4 = ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI);
                Iterator iterator1;
                og og1;
                Object obj5;
                int i1;
                int l1;
                try
                {
                    ((android.content.ContentProviderOperation.Builder) (obj4)).withValueBackReference(z[30], 0);
                    ((android.content.ContentProviderOperation.Builder) (obj4)).withValue(z[13], z[36]);
                    ((android.content.ContentProviderOperation.Builder) (obj4)).withValue(z[52], ((a) (obj2)).a);
                    ((android.content.ContentProviderOperation.Builder) (obj4)).withValue(z[53], Integer.valueOf(((a) (obj2)).d));
                    if (((a) (obj2)).d == 0)
                    {
                        ((android.content.ContentProviderOperation.Builder) (obj4)).withValue(z[74], ((a) (obj2)).c);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                ((ArrayList) (obj1)).add(((android.content.ContentProviderOperation.Builder) (obj4)).build());
            } while (k1 == 0);
        }
        if (n.i == null) goto _L2; else goto _L1
_L1:
        iterator = n.i.iterator();
_L3:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (d)iterator.next();
        if (((d) (obj2)).d == android/provider/ContactsContract$CommonDataKinds$Email)
        {
            obj4 = ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI);
            try
            {
                ((android.content.ContentProviderOperation.Builder) (obj4)).withValueBackReference(z[61], 0);
                ((android.content.ContentProviderOperation.Builder) (obj4)).withValue(z[55], z[42]);
                ((android.content.ContentProviderOperation.Builder) (obj4)).withValue(z[67], ((d) (obj2)).a);
                ((android.content.ContentProviderOperation.Builder) (obj4)).withValue(z[71], Integer.valueOf(((d) (obj2)).e));
                if (((d) (obj2)).e == 0)
                {
                    ((android.content.ContentProviderOperation.Builder) (obj4)).withValue(z[8], ((d) (obj2)).b);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            try
            {
                ((ArrayList) (obj1)).add(((android.content.ContentProviderOperation.Builder) (obj4)).build());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (k1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        obj4 = ((d) (obj2)).d;
        if (obj4 != android/provider/ContactsContract$CommonDataKinds$StructuredPostal)
        {
            break MISSING_BLOCK_LABEL_788;
        }
        obj4 = ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI);
        try
        {
            ((android.content.ContentProviderOperation.Builder) (obj4)).withValueBackReference(z[44], 0);
            ((android.content.ContentProviderOperation.Builder) (obj4)).withValue(z[16], z[39]);
            ((android.content.ContentProviderOperation.Builder) (obj4)).withValue(z[28], ((d) (obj2)).c.c());
            ((android.content.ContentProviderOperation.Builder) (obj4)).withValue(z[34], ((d) (obj2)).c.b);
            ((android.content.ContentProviderOperation.Builder) (obj4)).withValue(z[14], ((d) (obj2)).c.d);
            ((android.content.ContentProviderOperation.Builder) (obj4)).withValue(z[76], ((d) (obj2)).c.e);
            ((android.content.ContentProviderOperation.Builder) (obj4)).withValue(z[49], ((d) (obj2)).c.c);
            ((android.content.ContentProviderOperation.Builder) (obj4)).withValue(z[11], Integer.valueOf(((d) (obj2)).e));
            if (((d) (obj2)).e == 0)
            {
                ((android.content.ContentProviderOperation.Builder) (obj4)).withValue(z[7], ((d) (obj2)).b);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        ((ArrayList) (obj1)).add(((android.content.ContentProviderOperation.Builder) (obj4)).build());
        if (k1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj4 = ((d) (obj2)).d;
        if (obj4 != android/provider/ContactsContract$CommonDataKinds$Im)
        {
            break MISSING_BLOCK_LABEL_836;
        }
        Log.e((new StringBuilder()).append(z[40]).append(obj2.toString()).toString());
        if (k1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            Log.e((new StringBuilder()).append(z[59]).append(obj2.toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (k1 == 0) goto _L3; else goto _L2
_L2:
        Object obj;
        Object obj3;
        try
        {
            if (n.e == null)
            {
                break MISSING_BLOCK_LABEL_1050;
            }
            i1 = n.e.size();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_1050;
        }
        obj3 = (i)n.e.get(0);
        obj4 = ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI);
        ((android.content.ContentProviderOperation.Builder) (obj4)).withValueBackReference(z[62], 0);
        ((android.content.ContentProviderOperation.Builder) (obj4)).withValue(z[47], z[37]);
        i1 = ((i) (obj3)).a.lastIndexOf(" ");
        if (i1 > 0)
        {
            try
            {
                obj = ((i) (obj3)).a.substring(0, i1);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        } else
        {
            obj = ((i) (obj3)).a;
        }
        try
        {
            ((android.content.ContentProviderOperation.Builder) (obj4)).withValue(z[32], obj);
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_1024;
        }
        ((android.content.ContentProviderOperation.Builder) (obj4)).withValue(z[45], ((i) (obj3)).a.substring(i1 + 1));
        ((android.content.ContentProviderOperation.Builder) (obj4)).withValue(z[35], ((i) (obj3)).b);
        ((ArrayList) (obj1)).add(((android.content.ContentProviderOperation.Builder) (obj4)).build());
        if (n.l == null) goto _L5; else goto _L4
_L4:
        obj = n.l.keySet().iterator();
_L6:
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj4 = (String)((Iterator) (obj)).next();
        if (((String) (obj4)).equals(z[72]))
        {
            ((ArrayList) (obj1)).add(ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI).withValueBackReference(z[65], 0).withValue(z[69], z[22]).withValue(z[70], ((c)((List)n.l.get(obj4)).get(0)).a).build());
        }
        if (((String) (obj4)).equals(z[24]))
        {
            ((ArrayList) (obj1)).add(ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI).withValueBackReference(z[56], 0).withValue(z[73], z[57]).withValue(z[58], Integer.valueOf(3)).withValue(z[31], ((c)((List)n.l.get(obj4)).get(0)).a).build());
        }
        if (!g.j.containsKey(obj4))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj3 = (c)((List)n.l.get(obj4)).get(0);
        obj4 = ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI).withValueBackReference(z[33], 0).withValue(z[50], z[19]).withValue(z[27], g.j.get(obj4)).withValue(z[29], ((c)((List)n.l.get(obj4)).get(0)).a);
        if (((c) (obj3)).e == null)
        {
            break MISSING_BLOCK_LABEL_1465;
        }
        i1 = ((c) (obj3)).e.size();
        Exception exception1;
        if (i1 > 0)
        {
            try
            {
                ((android.content.ContentProviderOperation.Builder) (obj4)).withValue(z[25], ((c) (obj3)).e.toArray()[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception1)
            {
                throw exception1;
            }
        }
        ((ArrayList) (obj1)).add(((android.content.ContentProviderOperation.Builder) (obj4)).build());
        if (k1 == 0) goto _L6; else goto _L5
_L5:
        if (m != null)
        {
            obj = new ByteArrayOutputStream();
            m.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, ((java.io.OutputStream) (obj)));
            obj = ((ByteArrayOutputStream) (obj)).toByteArray();
            ((ArrayList) (obj1)).add(ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI).withValueBackReference(z[10], 0).withValue(z[48], z[60]).withValue(z[68], obj).build());
        }
        obj = App.d.applyBatch(z[21], ((ArrayList) (obj1)))[0].uri.getLastPathSegment();
        Log.i((new StringBuilder()).append(z[66]).append(n.f).append(z[75]).append(((String) (obj))).toString());
        obj1 = n.g.iterator();
        i1 = 0;
_L16:
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj3 = (a)((Iterator) (obj1)).next();
        obj4 = App.az.i(((a) (obj3)).a);
        if (((ArrayList) (obj4)).size() <= 0) goto _L8; else goto _L7
_L7:
        iterator1 = ((ArrayList) (obj4)).iterator();
        flag = false;
_L10:
        do
        {
            if (!iterator1.hasNext())
            {
                break MISSING_BLOCK_LABEL_1932;
            }
            og1 = (og)iterator1.next();
            obj5 = og1.a;
        } while (obj5 == null);
        obj5 = og1.z;
        if (obj5 != null && k1 == 0) goto _L10; else goto _L9
_L9:
        l1 = og1.a.indexOf('@');
        if (l1 != -1) goto _L12; else goto _L11
_L11:
        Log.w((new StringBuilder()).append(z[12]).append(og1.a).toString());
        if (k1 == 0) goto _L10; else goto _L12
_L12:
        obj5 = og1.a.substring(0, l1);
        if (PhoneNumberUtils.compare(((a) (obj3)).a, ((String) (obj5)))) goto _L14; else goto _L13
_L13:
        Log.w((new StringBuilder()).append(z[17]).append(og1.a).toString());
        if (k1 == 0) goto _L10; else goto _L14
_L14:
        Log.i((new StringBuilder()).append(z[18]).append(og1).toString());
        og1.z = new dh(Long.parseLong(((String) (obj))), ((a) (obj3)).a);
        og1.n = n.a();
        og1.t = true;
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_2115;
        }
        flag = true;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1953;
        }
        App.az.c(((java.util.Collection) (obj4)));
        App.S.sendEmptyMessage(1);
        if (k1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L8:
        i1 = 1;
        if (k1 == 0) goto _L16; else goto _L15
_L15:
        if (!i1)
        {
            break MISSING_BLOCK_LABEL_1991;
        }
        Log.i(z[41]);
        x.a(new t7(this));
_L18:
        f(getString(0x7f0e00ca, new Object[] {
            n.a()
        }));
        return;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
        exception1;
        throw exception1;
        exception1;
        try
        {
            throw exception1;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception1)
        {
            Log.e((new StringBuilder()).append(z[63]).append(exception1.toString()).toString());
        }
        if (true) goto _L18; else goto _L17
_L17:
        exception1;
        throw exception1;
        exception1;
        throw exception1;
        exception1;
        throw exception1;
        exception1;
        throw exception1;
        flag = true;
          goto _L10
    }

    public void onCreate(Bundle bundle)
    {
        Object obj1;
label0:
        {
            Object obj = null;
            int i1 = App.am;
            try
            {
                super.onCreate(bundle);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                setContentView(0x7f0300ae);
                q = getIntent().getBooleanExtra(z[86], false);
                p = getIntent().getStringExtra(z[82]);
                k = getIntent().getStringExtra(z[84]);
                j = getIntent().getStringExtra(z[85]);
                if (p == null)
                {
                    Log.e(z[80]);
                    App.b(this, 0x7f0e044e, 0);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            StringBuilder stringbuilder;
            int k1;
            boolean flag;
            try
            {
                o = (LinearLayout)findViewById(0x7f0b02c3);
                n = a(p);
                if (n == null)
                {
                    a(0x7f0e0164, new abb(this));
                }
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            try
            {
                if (!q)
                {
                    break label0;
                }
                findViewById(0x7f0b02c4).setVisibility(8);
                findViewById(0x7f0b02c5).setVisibility(0);
                bundle = n;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            if (bundle != null)
            {
                try
                {
                    n.m = g.a(getBaseContext(), j);
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    Log.e(z[83]);
                }
            }
            try
            {
                getSupportActionBar().setTitle(0x7f0e0374);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_277;
            }
        }
        findViewById(0x7f0b02c4).setVisibility(0);
        findViewById(0x7f0b02c5).setVisibility(8);
        getSupportActionBar().setTitle(0x7f0e047b);
        try
        {
            bundle = n;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            try
            {
                throw bundle;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle) { }
            try
            {
                throw bundle;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        if (bundle == null) goto _L2; else goto _L1
_L1:
        bundle = n.m;
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_408;
        }
        if (n.m.length <= 0)
        {
            break MISSING_BLOCK_LABEL_408;
        }
        flag = q;
label1:
        {
            if (!flag)
            {
                bundle = Base64.decode(n.m, 0);
                if (i1 == 0)
                {
                    break label1;
                }
            }
            bundle = n.m;
        }
        m = BitmapFactory.decodeByteArray(bundle, 0, bundle.length);
        bundle = new oe(this, null, null, 0, null, bundle);
        ((ImageView)findViewById(0x7f0b0141)).setImageBitmap(bundle.a(getResources().getDimensionPixelSize(0x7f0a0059), getResources().getDimension(0x7f0a0058), false));
        if (n.e == null) goto _L4; else goto _L3
_L3:
        k1 = n.e.size();
        if (k1 <= 0) goto _L4; else goto _L5
_L5:
        bundle = ((i)n.e.get(0)).a;
        obj = ((i)n.e.get(0)).b;
_L21:
        a(n.f.a, bundle, ((String) (obj)));
        if (n.g == null) goto _L7; else goto _L6
_L6:
        obj = n.g.iterator();
_L10:
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (a)((Iterator) (obj)).next();
        stringbuilder = (new StringBuilder()).append(getResources().getString(0x7f0e006c)).append(" ");
        if (((a) (obj1)).d != 0) goto _L9; else goto _L8
_L8:
        bundle = ((a) (obj1)).c;
_L18:
        bundle = a(stringbuilder.append(bundle).toString(), ((a) (obj1)).a, 0x7f02013b, ((a) (obj1)).a);
        bundle.setOnClickListener(new j1(this));
        bundle.setTag(obj1);
        o.addView(bundle);
        if (i1 == 0) goto _L10; else goto _L7
_L7:
        if (n.i == null) goto _L12; else goto _L11
_L11:
        obj = n.i.iterator();
_L17:
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (d)((Iterator) (obj)).next();
        try
        {
            bundle = ((d) (obj1)).d;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            try
            {
                throw bundle;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        if (bundle != android/provider/ContactsContract$CommonDataKinds$Email) goto _L14; else goto _L13
_L13:
        stringbuilder = (new StringBuilder()).append(getResources().getString(0x7f0e0143)).append(" ");
        if (((d) (obj1)).e != 0) goto _L16; else goto _L15
_L15:
        bundle = ((d) (obj1)).b;
_L19:
        bundle = a(stringbuilder.append(bundle).toString(), ((d) (obj1)).a, 0x7f020139, ((d) (obj1)).a);
        try
        {
            bundle.setOnClickListener(new s1(this));
            bundle.setTag(obj1);
            o.addView(bundle);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L14:
        bundle = ((d) (obj1)).d;
        if (bundle == android/provider/ContactsContract$CommonDataKinds$StructuredPostal)
        {
            bundle = a(((d) (obj1)), 0x7f02013a);
            bundle.setOnClickListener(new q6(this));
            bundle.setTag(obj1);
            o.addView(bundle);
        }
        if (i1 == 0) goto _L17; else goto _L12
_L12:
        if (n.l != null)
        {
            bundle = n.l.keySet().iterator();
            do
            {
                if (!bundle.hasNext())
                {
                    break;
                }
                obj = (String)bundle.next();
                obj = ((List)n.l.get(obj)).iterator();
label2:
                do
                {
                    do
                    {
                        if (!((Iterator) (obj)).hasNext())
                        {
                            break label2;
                        }
                        obj1 = (c)((Iterator) (obj)).next();
                        Log.e(((c) (obj1)).toString());
                    } while (((c) (obj1)).b.equals(z[87]) && !Pattern.compile(z[81]).matcher(((c) (obj1)).a).matches() && i1 == 0);
                    obj1 = a(((c) (obj1)));
                    o.addView(((View) (obj1)));
                } while (i1 == 0);
            } while (i1 == 0);
        }
        if (o.getChildCount() > 0)
        {
            o.getChildAt(o.getChildCount() - 1).findViewById(0x7f0b00d7).setVisibility(8);
        }
_L2:
        findViewById(0x7f0b0252).setOnClickListener(new nq(this));
        bundle = (Button)findViewById(0x7f0b01bd);
        bundle.setText(0x7f0e0373);
        bundle.setOnClickListener(new d0(this));
        ((Button)findViewById(0x7f0b01be)).setOnClickListener(new l5(this));
        return;
        bundle;
        throw bundle;
        bundle;
        throw bundle;
_L9:
        bundle = a(android/provider/ContactsContract$CommonDataKinds$Phone, ((a) (obj1)).d);
          goto _L18
_L16:
        bundle = a(android/provider/ContactsContract$CommonDataKinds$Email, ((d) (obj1)).e);
          goto _L19
_L4:
        bundle = null;
        if (true) goto _L21; else goto _L20
_L20:
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return false;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR lookupswitch 3: default 61
    //                   0: 40
    //                   1: 49
    //                   16908332: 55;
           goto _L1 _L2 _L3 _L4
_L2:
        d();
        return true;
        menuitem;
        throw menuitem;
_L3:
        b();
        return true;
_L4:
        finish();
        return true;
_L1:
        return false;
    }

    public void onResume()
    {
        super.onResume();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[91];
        obj = "\017,u\033I\021$b\t^\032*~\030[\0321q\017N\0203y\030CV h\030_\0276y\003TY";
        byte0 = -1;
        i1 = 0;
_L2:
        String as1[];
        int k1;
        int l1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l1 = obj.length;
        k1 = 0;
_L8:
label0:
        {
            if (l1 > k1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "\t-\177\002_C";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                i1 = 2;
                obj = "\034(q\005V";
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                i1 = 3;
                obj = "\t*c\030[\025";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "\f+s\004_\032.u\b\0";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "\035$d\r\003";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "\035$d\r\t";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "\035$d\r\t";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "\035$d\r\t";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "\035$d\r\f";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "\013$g3Y\026+d\rY\r\032y\b";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "\035$d\r\b";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "\017,u\033e\n-q\036_\035\032s\003T\r$s\030\025\033$t3P\020!*L";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "\024,}\tN\0005u";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "\035$d\r\002";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "\035$d\r\016";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                obj = "\024,}\tN\0005u";
                byte0 = 15;
                i1 = 16;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "\017,u\033e\n-q\036_\035\032s\003T\r$s\030\025\037$|\037_&(q\030Y\021\1770";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "\017,u\033e\n-q\036_\035\032s\003T\r$s\030\025\f+{\003M\027\032s\003T\r$s\030e\f5t\rN\034\177";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "\017+tB[\027!b\003S\035ks\031H\n*bBS\r }CS\024";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "\035$d\r\017";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "\032*}B[\027!b\003S\035ks\003T\r$s\030I";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "\017+tB[\027!b\003S\035ks\031H\n*bBS\r }CT\020&{\002[\024 ";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "\013$g3Y\026+d\rY\r\032y\b";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = ";\001Q5";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                i1 = 25;
                obj = "\035$d\r\b";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i1] = ((String) (obj));
                i1 = 26;
                obj = "\017+tB[\027!b\003S\035ks\031H\n*bBS\r }CT\030(u";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i1] = ((String) (obj));
                i1 = 27;
                obj = "\035$d\r\017";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i1] = ((String) (obj));
                i1 = 28;
                obj = "\035$d\r\016";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i1] = ((String) (obj));
                i1 = 29;
                obj = "\035$d\r\013";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i1] = ((String) (obj));
                i1 = 30;
                obj = "\013$g3Y\026+d\rY\r\032y\b";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i1] = ((String) (obj));
                i1 = 31;
                obj = "\035$d\r\013";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i1] = ((String) (obj));
                i1 = 32;
                obj = "\035$d\r\013";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i1] = ((String) (obj));
                i1 = 33;
                obj = "\013$g3Y\026+d\rY\r\032y\b";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i1] = ((String) (obj));
                i1 = 34;
                obj = "\035$d\r\r";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i1] = ((String) (obj));
                i1 = 35;
                obj = "\035$d\r\016";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i1] = ((String) (obj));
                i1 = 36;
                obj = "\017+tB[\027!b\003S\035ks\031H\n*bBS\r }CJ\021*~\te\017w";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i1] = ((String) (obj));
                i1 = 37;
                obj = "\017+tB[\027!b\003S\035ks\031H\n*bBS\r }CU\013\"q\002S\003$d\005U\027";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i1] = ((String) (obj));
                i1 = 38;
                obj = "\030&s\003O\0271O\002[\024 ";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i1] = ((String) (obj));
                i1 = 39;
                obj = "\017+tB[\027!b\003S\035ks\031H\n*bBS\r }CJ\0266d\rVT$t\bH\0346c3LK";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i1] = ((String) (obj));
                i1 = 40;
                obj = "\017,u\033I\021$b\t^\032*~\030[\0321q\017N\0203y\030CY";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i1] = ((String) (obj));
                i1 = 41;
                obj = "\017,u\033e\n-q\036_\035\032s\003T\r$s\030\025\027 g3T\f(r\tHV+u\t^&!u\000N\030\032c\025T\032";
                byte0 = 40;
                break;

            case 40: // '('
                as1[i1] = ((String) (obj));
                i1 = 42;
                obj = "\017+tB[\027!b\003S\035ks\031H\n*bBS\r }C_\024$y\000e\017w";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[i1] = ((String) (obj));
                i1 = 43;
                obj = "\030&s\003O\0271O\030C\t ";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[i1] = ((String) (obj));
                i1 = 44;
                obj = "\013$g3Y\026+d\rY\r\032y\b";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[i1] = ((String) (obj));
                i1 = 45;
                obj = "\035$d\r\017";
                byte0 = 44;
                break;

            case 44: // ','
                as1[i1] = ((String) (obj));
                i1 = 46;
                obj = "\035$d\r\013";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[i1] = ((String) (obj));
                i1 = 47;
                obj = "\024,}\tN\0005u";
                byte0 = 46;
                break;

            case 46: // '.'
                as1[i1] = ((String) (obj));
                i1 = 48;
                obj = "\024,}\tN\0005u";
                byte0 = 47;
                break;

            case 47: // '/'
                as1[i1] = ((String) (obj));
                i1 = 49;
                obj = "\035$d\r\013I";
                byte0 = 48;
                break;

            case 48: // '0'
                as1[i1] = ((String) (obj));
                i1 = 50;
                obj = "\024,}\tN\0005u";
                byte0 = 49;
                break;

            case 49: // '1'
                as1[i1] = ((String) (obj));
                i1 = 51;
                obj = "\024,}\tN\0005u";
                byte0 = 50;
                break;

            case 50: // '2'
                as1[i1] = ((String) (obj));
                i1 = 52;
                obj = "\035$d\r\013";
                byte0 = 51;
                break;

            case 51: // '3'
                as1[i1] = ((String) (obj));
                i1 = 53;
                obj = "\035$d\r\b";
                byte0 = 52;
                break;

            case 52: // '4'
                as1[i1] = ((String) (obj));
                i1 = 54;
                obj = "\035$d\r\b";
                byte0 = 53;
                break;

            case 53: // '5'
                as1[i1] = ((String) (obj));
                i1 = 55;
                obj = "\024,}\tN\0005u";
                byte0 = 54;
                break;

            case 54: // '6'
                as1[i1] = ((String) (obj));
                i1 = 56;
                obj = "\013$g3Y\026+d\rY\r\032y\b";
                byte0 = 55;
                break;

            case 55: // '7'
                as1[i1] = ((String) (obj));
                i1 = 57;
                obj = "\017+tB[\027!b\003S\035ks\031H\n*bBS\r }CY\026+d\rY\r\032u\032_\0271";
                byte0 = 56;
                break;

            case 56: // '8'
                as1[i1] = ((String) (obj));
                obj = "\035$d\r\b";
                byte0 = 57;
                i1 = 58;
                break;

            case 57: // '9'
                as1[i1] = ((String) (obj));
                i1 = 59;
                obj = "\017,u\033I\021$b\t^\032*~\030[\0321q\017N\0203y\030CV1i\034_V0~\007T\0262~L";
                byte0 = 58;
                break;

            case 58: // ':'
                as1[i1] = ((String) (obj));
                i1 = 60;
                obj = "\017+tB[\027!b\003S\035ks\031H\n*bBS\r }CJ\021*d\003";
                byte0 = 59;
                break;

            case 59: // ';'
                as1[i1] = ((String) (obj));
                i1 = 61;
                obj = "\013$g3Y\026+d\rY\r\032y\b";
                byte0 = 60;
                break;

            case 60: // '<'
                as1[i1] = ((String) (obj));
                i1 = 62;
                obj = "\013$g3Y\026+d\rY\r\032y\b";
                byte0 = 61;
                break;

            case 61: // '='
                as1[i1] = ((String) (obj));
                i1 = 63;
                obj = "\030!t3I\021$b\t^&&\177\002N\030&dC";
                byte0 = 62;
                break;

            case 62: // '>'
                as1[i1] = ((String) (obj));
                i1 = 64;
                obj = "\035$d\r\r";
                byte0 = 63;
                break;

            case 63: // '?'
                as1[i1] = ((String) (obj));
                i1 = 65;
                obj = "\013$g3Y\026+d\rY\r\032y\b";
                byte0 = 64;
                break;

            case 64: // '@'
                as1[i1] = ((String) (obj));
                i1 = 66;
                obj = "\017,u\033e\n-q\036_\035\032s\003T\r$s\030\025\0327u\rN\034\032s\003T\r$s\030\000Y";
                byte0 = 65;
                break;

            case 65: // 'A'
                as1[i1] = ((String) (obj));
                i1 = 67;
                obj = "\035$d\r\013";
                byte0 = 66;
                break;

            case 66: // 'B'
                as1[i1] = ((String) (obj));
                i1 = 68;
                obj = "\035$d\r\013L";
                byte0 = 67;
                break;

            case 67: // 'C'
                as1[i1] = ((String) (obj));
                obj = "\024,}\tN\0005u";
                byte0 = 68;
                i1 = 69;
                break;

            case 68: // 'D'
                as1[i1] = ((String) (obj));
                i1 = 70;
                obj = "\035$d\r\013";
                byte0 = 69;
                break;

            case 69: // 'E'
                as1[i1] = ((String) (obj));
                i1 = 71;
                obj = "\035$d\r\b";
                byte0 = 70;
                break;

            case 70: // 'F'
                as1[i1] = ((String) (obj));
                i1 = 72;
                obj = "7\fS't8\bU";
                byte0 = 71;
                break;

            case 71: // 'G'
                as1[i1] = ((String) (obj));
                i1 = 73;
                obj = "\024,}\tN\0005u";
                byte0 = 72;
                break;

            case 72: // 'H'
                as1[i1] = ((String) (obj));
                i1 = 74;
                obj = "\035$d\r\t";
                byte0 = 73;
                break;

            case 73: // 'I'
                as1[i1] = ((String) (obj));
                i1 = 75;
                obj = "Y90";
                byte0 = 74;
                break;

            case 74: // 'J'
                as1[i1] = ((String) (obj));
                i1 = 76;
                obj = "\035$d\r\003";
                byte0 = 75;
                break;

            case 75: // 'K'
                as1[i1] = ((String) (obj));
                i1 = 77;
                obj = "\025$i\003O\r\032y\002\\\025$d\tH";
                byte0 = 76;
                break;

            case 76: // 'L'
                as1[i1] = ((String) (obj));
                i1 = 78;
                obj = "\025$i\003O\r\032y\002\\\025$d\tH";
                byte0 = 77;
                break;

            case 77: // 'M'
                as1[i1] = ((String) (obj));
                i1 = 79;
                obj = ",\027\\";
                byte0 = 78;
                break;

            case 78: // 'N'
                as1[i1] = ((String) (obj));
                i1 = 80;
                obj = "\017,u\033I\021$b\t^\032*~\030[\0321?\017H\034$d\t\025\017&q\036^Y,cLT\f)|M";
                byte0 = 79;
                break;

            case 79: // 'O'
                as1[i1] = ((String) (obj));
                i1 = 81;
                obj = "Q-d\030J\005-d\030J\nl*C\025Q\036L\033\027$nLB\023R\036L\033\027$n8Ca%2=L\024Vz5J[\0245+QgSl/";
                byte0 = 80;
                break;

            case 80: // 'P'
                as1[i1] = ((String) (obj));
                i1 = 82;
                obj = "\017&q\036^";
                byte0 = 81;
                break;

            case 81: // 'Q'
                as1[i1] = ((String) (obj));
                i1 = 83;
                obj = "\017,u\033R\0307u\bY\026+d\rY\rj|\003[\035\032s\003T\r$s\030e\t-\177\030U&#q\005V\034!0";
                byte0 = 82;
                break;

            case 82: // 'R'
                as1[i1] = ((String) (obj));
                i1 = 84;
                obj = "\023,t";
                byte0 = 83;
                break;

            case 83: // 'S'
                as1[i1] = ((String) (obj));
                i1 = 85;
                obj = "\032*~\030[\0321O\005^";
                byte0 = 84;
                break;

            case 84: // 'T'
                as1[i1] = ((String) (obj));
                i1 = 86;
                obj = "\034!y\030e\032*~\030[\0321O\005T\037*";
                byte0 = 85;
                break;

            case 85: // 'U'
                as1[i1] = ((String) (obj));
                i1 = 87;
                obj = ",\027\\";
                byte0 = 86;
                break;

            case 86: // 'V'
                as1[i1] = ((String) (obj));
                i1 = 88;
                obj = "\036 d8C\t \\\rX\034)B\tI\0260b\017_";
                byte0 = 87;
                break;

            case 87: // 'W'
                as1[i1] = ((String) (obj));
                i1 = 89;
                obj = "\0270|\0";
                byte0 = 88;
                break;

            case 88: // 'X'
                as1[i1] = ((String) (obj));
                i1 = 90;
                obj = "\025$i\003O\r\032y\002\\\025$d\tH";
                byte0 = 89;
                break;

            case 89: // 'Y'
                as1[i1] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[k1];
        k1 % 5;
        JVM INSTR tableswitch 0 3: default 2084
    //                   0 2107
    //                   1 2114
    //                   2 2121
    //                   3 2128;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_2128;
_L3:
        byte byte1 = 58;
_L9:
        obj[k1] = (char)(byte1 ^ c1);
        k1++;
          goto _L8
_L4:
        byte1 = 121;
          goto _L9
_L5:
        byte1 = 69;
          goto _L9
_L6:
        byte1 = 16;
          goto _L9
        byte1 = 108;
          goto _L9
    }
}
