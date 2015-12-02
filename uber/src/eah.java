// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.preference.Preference;
import android.preference.PreferenceFragment;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class eah
{

    private static Preference a(PreferenceFragment preferencefragment, int i)
    {
        String s = preferencefragment.getString(i);
        preferencefragment = preferencefragment.findPreference(s);
        if (preferencefragment == null)
        {
            throw new eak(s);
        } else
        {
            return preferencefragment;
        }
    }

    public static void a(PreferenceFragment preferencefragment)
    {
        int i;
        boolean flag = false;
        Object aobj[];
        Object obj;
        Object obj1;
        int j;
        try
        {
            aobj = preferencefragment.getClass().getDeclaredFields();
            j = aobj.length;
        }
        // Misplaced declaration of an exception variable
        catch (PreferenceFragment preferencefragment)
        {
            throw new RuntimeException(preferencefragment);
        }
        i = 0;
_L5:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        obj = aobj[i];
        obj1 = (eae)((Field) (obj)).getAnnotation(eae);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        obj1 = a(preferencefragment, ((eae) (obj1)).a());
        ((Field) (obj)).setAccessible(true);
        ((Field) (obj)).set(preferencefragment, obj1);
        break MISSING_BLOCK_LABEL_189;
        aobj = preferencefragment.getClass().getDeclaredMethods();
        j = aobj.length;
        i = ((flag) ? 1 : 0);
_L3:
        if (i >= j) goto _L2; else goto _L1
_L1:
        obj = aobj[i];
        obj1 = (eag)((Method) (obj)).getAnnotation(eag);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        a(preferencefragment, ((eag) (obj1)).a()).setOnPreferenceClickListener(new eaj(((Method) (obj)), preferencefragment));
        obj1 = (eaf)((Method) (obj)).getAnnotation(eaf);
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        a(preferencefragment, ((eaf) (obj1)).a()).setOnPreferenceChangeListener(new eai(((Method) (obj)), preferencefragment));
        i++;
          goto _L3
_L2:
        return;
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
