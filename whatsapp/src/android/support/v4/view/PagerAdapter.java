// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class PagerAdapter
{

    private static final String z[];
    private DataSetObservable mObservable;

    public PagerAdapter()
    {
        mObservable = new DataSetObservable();
    }

    public void destroyItem(View view, int i, Object obj)
    {
        throw new UnsupportedOperationException(z[1]);
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        destroyItem(((View) (viewgroup)), i, obj);
    }

    public void finishUpdate(View view)
    {
    }

    public void finishUpdate(ViewGroup viewgroup)
    {
        finishUpdate(((View) (viewgroup)));
    }

    public abstract int getCount();

    public int getItemPosition(Object obj)
    {
        return -1;
    }

    public CharSequence getPageTitle(int i)
    {
        return null;
    }

    public float getPageWidth(int i)
    {
        return 1.0F;
    }

    public Object instantiateItem(View view, int i)
    {
        throw new UnsupportedOperationException(z[0]);
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        return instantiateItem(((View) (viewgroup)), i);
    }

    public abstract boolean isViewFromObject(View view, Object obj);

    public void notifyDataSetChanged()
    {
        mObservable.notifyChanged();
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        mObservable.registerObserver(datasetobserver);
    }

    public void restoreState(Parcelable parcelable, ClassLoader classloader)
    {
    }

    public Parcelable saveState()
    {
        return null;
    }

    public void setPrimaryItem(View view, int i, Object obj)
    {
    }

    public void setPrimaryItem(ViewGroup viewgroup, int i, Object obj)
    {
        setPrimaryItem(((View) (viewgroup)), i, obj);
    }

    public void startUpdate(View view)
    {
    }

    public void startUpdate(ViewGroup viewgroup)
    {
        startUpdate(((View) (viewgroup)));
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        mObservable.unregisterObserver(datasetobserver);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\036\"\027M0>\"\002\0304)3\016W=l.\bK--)\022Q88\"/L<!g\021Y*l)\tLy#1\003J+%#\002]7";
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
                i = 1;
                obj = "\036\"\027M0>\"\002\0304)3\016W=l#\003K->(\037q-)*FO8?g\bW-l(\020]+>.\002\\<\"";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 89;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 76;
          goto _L9
_L5:
        byte0 = 71;
          goto _L9
_L6:
        byte0 = 102;
          goto _L9
        byte0 = 56;
          goto _L9
    }
}
