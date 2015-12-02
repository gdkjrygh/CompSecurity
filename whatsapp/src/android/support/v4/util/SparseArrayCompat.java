// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;


// Referenced classes of package android.support.v4.util:
//            ContainerHelpers, LruCache

public class SparseArrayCompat
    implements Cloneable
{

    private static final Object DELETED;
    private static final String z[];
    private boolean mGarbage;
    private int mKeys[];
    private int mSize;
    private Object mValues[];

    public SparseArrayCompat()
    {
        this(10);
    }

    public SparseArrayCompat(int i)
    {
label0:
        {
            super();
            mGarbage = false;
            if (i == 0)
            {
                mKeys = ContainerHelpers.EMPTY_INTS;
                mValues = ContainerHelpers.EMPTY_OBJECTS;
                if (!LruCache.a)
                {
                    break label0;
                }
            }
            i = ContainerHelpers.idealIntArraySize(i);
            mKeys = new int[i];
            mValues = new Object[i];
        }
        mSize = 0;
    }

    private void gc()
    {
        boolean flag = LruCache.a;
        int l = mSize;
        int ai[] = mKeys;
        Object aobj[] = mValues;
        int k = 0;
        int i = 0;
        int j;
        do
        {
            j = i;
            if (k >= l)
            {
                break;
            }
            Object obj = aobj[k];
            j = i;
            if (obj != DELETED)
            {
                if (k != i)
                {
                    ai[i] = ai[k];
                    aobj[i] = obj;
                    aobj[k] = null;
                }
                j = i + 1;
            }
            k++;
            i = j;
        } while (!flag);
        mGarbage = false;
        mSize = j;
    }

    public void clear()
    {
        boolean flag = LruCache.a;
        int j = mSize;
        Object aobj[] = mValues;
        int i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            aobj[i] = null;
            i++;
        } while (!flag);
        mSize = 0;
        mGarbage = false;
    }

    public SparseArrayCompat clone()
    {
        Object obj;
        try
        {
            obj = (SparseArrayCompat)super.clone();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        try
        {
            obj.mKeys = (int[])mKeys.clone();
            obj.mValues = (Object[])((Object []) (mValues)).clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return ((SparseArrayCompat) (obj));
        }
        return ((SparseArrayCompat) (obj));
    }

    public Object clone()
    {
        return clone();
    }

    public void delete(int i)
    {
        i = ContainerHelpers.binarySearch(mKeys, mSize, i);
        if (i >= 0 && mValues[i] != DELETED)
        {
            mValues[i] = DELETED;
            mGarbage = true;
        }
    }

    public Object get(int i)
    {
        return get(i, null);
    }

    public Object get(int i, Object obj)
    {
        i = ContainerHelpers.binarySearch(mKeys, mSize, i);
        if (i < 0 || mValues[i] == DELETED)
        {
            return obj;
        } else
        {
            return mValues[i];
        }
    }

    public int indexOfKey(int i)
    {
        if (mGarbage)
        {
            gc();
        }
        return ContainerHelpers.binarySearch(mKeys, mSize, i);
    }

    public int keyAt(int i)
    {
        if (mGarbage)
        {
            gc();
        }
        return mKeys[i];
    }

    public void put(int i, Object obj)
    {
        int l;
label0:
        {
label1:
            {
                int j = ContainerHelpers.binarySearch(mKeys, mSize, i);
                if (j >= 0)
                {
                    mValues[j] = obj;
                    if (!LruCache.a)
                    {
                        break label1;
                    }
                }
                l = ~j;
                if (l >= mSize || mValues[l] != DELETED)
                {
                    break label0;
                }
                mKeys[l] = i;
                mValues[l] = obj;
            }
            return;
        }
        int k = l;
        if (mGarbage)
        {
            k = l;
            if (mSize >= mKeys.length)
            {
                gc();
                k = ~ContainerHelpers.binarySearch(mKeys, mSize, i);
            }
        }
        if (mSize >= mKeys.length)
        {
            int i1 = ContainerHelpers.idealIntArraySize(mSize + 1);
            int ai[] = new int[i1];
            Object aobj[] = new Object[i1];
            System.arraycopy(mKeys, 0, ai, 0, mKeys.length);
            System.arraycopy(((Object) (mValues)), 0, ((Object) (aobj)), 0, mValues.length);
            mKeys = ai;
            mValues = aobj;
        }
        if (mSize - k != 0)
        {
            System.arraycopy(mKeys, k, mKeys, k + 1, mSize - k);
            System.arraycopy(((Object) (mValues)), k, ((Object) (mValues)), k + 1, mSize - k);
        }
        mKeys[k] = i;
        mValues[k] = obj;
        mSize = mSize + 1;
    }

    public void remove(int i)
    {
        delete(i);
    }

    public void removeAt(int i)
    {
        if (mValues[i] != DELETED)
        {
            mValues[i] = DELETED;
            mGarbage = true;
        }
    }

    public int size()
    {
        if (mGarbage)
        {
            gc();
        }
        return mSize;
    }

    public String toString()
    {
        boolean flag = LruCache.a;
        if (size() <= 0)
        {
            return z[1];
        }
        StringBuilder stringbuilder = new StringBuilder(mSize * 28);
        stringbuilder.append('{');
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= mSize)
                {
                    break label0;
                }
                if (i > 0)
                {
                    stringbuilder.append(z[0]);
                }
                stringbuilder.append(keyAt(i));
                stringbuilder.append('=');
                Object obj = valueAt(i);
                if (obj != this)
                {
                    stringbuilder.append(obj);
                    if (!flag)
                    {
                        break label1;
                    }
                }
                stringbuilder.append(z[2]);
            }
            i++;
        } while (!flag);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    public Object valueAt(int i)
    {
        if (mGarbage)
        {
            gc();
        }
        return mValues[i];
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "gE";
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
                obj = "0\030";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "c\021xz\020k(qcJ";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                DELETED = new Object();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 168
    //                   0 189
    //                   1 195
    //                   2 201
    //                   3 207;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_207;
_L3:
        byte byte0 = 99;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 75;
          goto _L9
_L5:
        byte0 = 101;
          goto _L9
_L6:
        byte0 = 16;
          goto _L9
        byte0 = 19;
          goto _L9
    }
}
