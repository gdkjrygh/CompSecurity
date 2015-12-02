// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.whatsapp.DialogToastActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.whatsapp.preference:
//            WaListPreference, a

public class WaMultiSelectListPreference extends WaListPreference
{

    private static final String z[];
    private String b;
    private String c;
    private String d;
    private boolean e[];

    public WaMultiSelectListPreference(Context context)
    {
        this(context, null);
    }

    public WaMultiSelectListPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = new boolean[getEntries().length];
        b = z[2];
    }

    private CharSequence a(List list)
    {
        boolean flag = WaListPreference.a;
        boolean flag1 = list.isEmpty();
        if (flag1)
        {
            try
            {
                if (!TextUtils.isEmpty(c))
                {
                    return c;
                }
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                throw list;
            }
        }
        break MISSING_BLOCK_LABEL_39;
        list;
        throw list;
        ArrayList arraylist;
        CharSequence acharsequence[];
        CharSequence acharsequence1[];
        arraylist = new ArrayList();
        acharsequence = getEntries();
        acharsequence1 = getEntryValues();
        int i;
        int k;
        i = list.size();
        k = acharsequence1.length;
        if (i == k)
        {
            try
            {
                if (!TextUtils.isEmpty(d))
                {
                    return d;
                }
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                throw list;
            }
        }
        break MISSING_BLOCK_LABEL_99;
        list;
        throw list;
        int i1 = acharsequence1.length;
        int j = 0;
        int l = 0;
        do
        {
label0:
            {
                if (j < i1)
                {
                    CharSequence charsequence = acharsequence1[j];
                    try
                    {
                        if (list.contains(charsequence))
                        {
                            arraylist.add((String)acharsequence[l]);
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (List list)
                    {
                        throw list;
                    }
                    l++;
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return a(((Iterable) (arraylist)), z[1]);
            }
            j++;
        } while (true);
    }

    protected static String a(Iterable iterable, String s)
    {
        boolean flag;
label0:
        {
            flag = WaListPreference.a;
            if (iterable != null)
            {
                iterable = iterable.iterator();
                try
                {
                    if (iterable.hasNext())
                    {
                        break label0;
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Iterable iterable)
                {
                    throw iterable;
                }
            }
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(String.valueOf(iterable.next()));
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            stringbuilder.append(s).append(iterable.next());
        } while (!flag);
        return stringbuilder.toString();
    }

    private void a()
    {
        boolean flag = WaListPreference.a;
        CharSequence acharsequence[] = getEntryValues();
        CharSequence acharsequence1[] = a(((CharSequence) (getValue())));
        if (acharsequence1 != null)
        {
            List list = Arrays.asList(acharsequence1);
            int i = 0;
            do
            {
                if (i >= acharsequence.length)
                {
                    break;
                }
                CharSequence charsequence = acharsequence[i];
                e[i] = list.contains(charsequence);
                i++;
            } while (!flag);
        }
    }

    private CharSequence[] a(CharSequence charsequence)
    {
label0:
        {
            if (charsequence != null)
            {
                try
                {
                    if (!"".equals(charsequence))
                    {
                        break label0;
                    }
                }
                // Misplaced declaration of an exception variable
                catch (CharSequence charsequence)
                {
                    throw charsequence;
                }
            }
            return new CharSequence[0];
        }
        return ((String)charsequence).split(b);
    }

    static boolean[] a(WaMultiSelectListPreference wamultiselectlistpreference)
    {
        return wamultiselectlistpreference.e;
    }

    private void b(String s)
    {
        try
        {
            if (callChangeListener(a(s)))
            {
                setValue(s);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
    }

    public void a(String s)
    {
        d = s;
    }

    public void a(CharSequence acharsequence[])
    {
        onSetInitialValue(false, acharsequence);
    }

    public void c(String s)
    {
        c = s;
    }

    protected void onDialogClosed(boolean flag)
    {
        ArrayList arraylist;
        CharSequence acharsequence[];
        boolean flag1;
        flag1 = WaListPreference.a;
        arraylist = new ArrayList();
        acharsequence = getEntryValues();
        if (!flag || acharsequence == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L7:
        if (i >= acharsequence.length) goto _L4; else goto _L3
_L3:
        if (e[i])
        {
            arraylist.add((String)acharsequence[i]);
        }
        if (!flag1) goto _L5; else goto _L4
_L4:
        String s = a(arraylist, b);
        setSummary(a(arraylist));
        b(s);
_L2:
        return;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected Object onGetDefaultValue(TypedArray typedarray, int i)
    {
        return typedarray.getTextArray(i);
    }

    protected void onPrepareDialogBuilder(android.app.AlertDialog.Builder builder)
    {
        CharSequence acharsequence[];
        CharSequence acharsequence1[];
        acharsequence = getEntries();
        acharsequence1 = getEntryValues();
        if (acharsequence == null || acharsequence1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        if (acharsequence.length == acharsequence1.length)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        throw new IllegalStateException(z[0]);
        builder;
        throw builder;
        a();
        a a1 = new a(this);
        builder.setMultiChoiceItems(acharsequence, e, a1);
        return;
    }

    protected void onSetInitialValue(boolean flag, Object obj)
    {
        boolean flag1 = WaListPreference.a;
        String s;
        int i;
        if (obj != null || flag1)
        {
            obj = (CharSequence[])(CharSequence[])obj;
        } else
        {
            obj = new CharSequence[0];
        }
        s = a(Arrays.asList(((Object []) (obj))), b);
        obj = s;
        if (flag)
        {
            obj = getPersistedString(s);
        }
        try
        {
            setSummary(a(Arrays.asList(a(((CharSequence) (obj))))));
            b(((String) (obj)));
            i = DialogToastActivity.g;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (i != 0)
        {
            if (flag1)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            WaListPreference.a = flag;
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "oYy/jqIy>`V`|(wr^p=fPI{8f\002^p*vK^p(#CB5>mV^|>p\002Mg)b[\ft5g\002M{{fLXg\"UC@`>p\002Mg)b[\fb3jAD5:qG\fw4wJ\fa3f\002_t6f\002@p5dVD";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\016\f";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "mz(\022>z_p+bPMa4qz\021\\fUm";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 176
    //                   1 182
    //                   2 188
    //                   3 194;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_194;
_L3:
        byte byte0 = 3;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 34;
          goto _L9
_L5:
        byte0 = 44;
          goto _L9
_L6:
        byte0 = 21;
          goto _L9
        byte0 = 91;
          goto _L9
    }
}
