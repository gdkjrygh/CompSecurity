// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;

import java.util.Map;

// Referenced classes of package android.support.v4.util:
//            ContainerHelpers, ArrayMap, LruCache

public class SimpleArrayMap
{

    static Object mBaseCache[];
    static int mBaseCacheSize;
    static Object mTwiceBaseCache[];
    static int mTwiceBaseCacheSize;
    private static final String z[];
    Object mArray[];
    int mHashes[];
    int mSize;

    public SimpleArrayMap()
    {
        mHashes = ContainerHelpers.EMPTY_INTS;
        mArray = ContainerHelpers.EMPTY_OBJECTS;
        mSize = 0;
    }

    private void allocArrays(int i)
    {
        if (i != 8) goto _L2; else goto _L1
_L1:
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorenter ;
        Object aobj[];
        if (mTwiceBaseCache == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        aobj = mTwiceBaseCache;
        mArray = aobj;
        mTwiceBaseCache = (Object[])(Object[])aobj[0];
        mHashes = (int[])(int[])aobj[1];
        aobj[1] = null;
        aobj[0] = null;
        mTwiceBaseCacheSize--;
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorexit ;
        return;
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorexit ;
        Exception exception;
        boolean flag;
        try
        {
            flag = LruCache.a;
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        if (!flag) goto _L3; else goto _L2
_L2:
        if (i != 4) goto _L3; else goto _L4
_L4:
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorenter ;
        if (mBaseCache == null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        aobj = mBaseCache;
        mArray = aobj;
        mBaseCache = (Object[])(Object[])aobj[0];
        mHashes = (int[])(int[])aobj[1];
        aobj[1] = null;
        aobj[0] = null;
        mBaseCacheSize--;
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorexit ;
        return;
        exception;
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorexit ;
        throw exception;
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorexit ;
_L3:
        mHashes = new int[i];
        mArray = new Object[i << 1];
        return;
    }

    private static void freeArrays(int ai[], Object aobj[], int i)
    {
        boolean flag = LruCache.a;
        if (ai.length != 8) goto _L2; else goto _L1
_L1:
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorenter ;
        if (mTwiceBaseCacheSize < 10)
        {
            aobj[0] = ((Object) (mTwiceBaseCache));
            break MISSING_BLOCK_LABEL_29;
        }
          goto _L3
_L8:
        mTwiceBaseCache = aobj;
        mTwiceBaseCacheSize++;
_L3:
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorexit ;
        if (!flag) goto _L4; else goto _L2
_L2:
        try
        {
            j = ai.length;
        }
        // Misplaced declaration of an exception variable
        catch (int ai[])
        {
            throw ai;
        }
        if (j != 4) goto _L4; else goto _L5
_L5:
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorenter ;
        if (mBaseCacheSize >= 10) goto _L7; else goto _L6
_L6:
        aobj[0] = ((Object) (mBaseCache));
        aobj[1] = ai;
        i = (i << 1) - 1;
        break MISSING_BLOCK_LABEL_152;
_L9:
        mBaseCache = aobj;
        mBaseCacheSize++;
_L7:
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorexit ;
_L4:
        return;
        ai;
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorexit ;
        throw ai;
        ai;
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorexit ;
        throw ai;
        aobj[1] = ai;
        int j = (i << 1) - 1;
        do
        {
            if (j < 2)
            {
                break;
            }
            aobj[j] = null;
            j--;
        } while (!flag);
          goto _L8
        do
        {
            if (i < 2)
            {
                break;
            }
            aobj[i] = null;
            i--;
        } while (!flag);
          goto _L9
    }

    public void clear()
    {
        try
        {
            if (mSize != 0)
            {
                freeArrays(mHashes, mArray, mSize);
                mHashes = ContainerHelpers.EMPTY_INTS;
                mArray = ContainerHelpers.EMPTY_OBJECTS;
                mSize = 0;
            }
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
    }

    public boolean containsKey(Object obj)
    {
        int i;
        try
        {
            i = indexOfKey(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        return i >= 0;
    }

    public boolean containsValue(Object obj)
    {
        int i;
        try
        {
            i = indexOfValue(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        return i >= 0;
    }

    public void ensureCapacity(int i)
    {
        if (mHashes.length < i)
        {
            int ai[] = mHashes;
            Object aobj[] = mArray;
            try
            {
                allocArrays(i);
                if (mSize > 0)
                {
                    System.arraycopy(ai, 0, mHashes, 0, mSize);
                    System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, mSize << 1);
                }
            }
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            freeArrays(ai, aobj, mSize);
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag = LruCache.a;
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof Map)) goto _L4; else goto _L3
_L3:
        int i;
        obj = (Map)obj;
        int j;
        try
        {
            i = size();
            j = ((Map) (obj)).size();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (i != j)
        {
            return false;
        }
        i = 0;
_L6:
        Object obj1;
        Object obj2;
        Object obj3;
        boolean flag1;
        try
        {
            if (i >= mSize)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj1 = keyAt(i);
            obj2 = valueAt(i);
            obj3 = ((Map) (obj)).get(obj1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        if (obj3 != null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        flag1 = ((Map) (obj)).containsKey(obj1);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        return false;
        obj;
        throw obj;
        flag1 = obj2.equals(obj3);
        if (!flag1)
        {
            return false;
        }
        i++;
        if (flag)
        {
            return true;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L1; else goto _L4
_L4:
        return false;
    }

    public Object get(Object obj)
    {
        int i = indexOfKey(obj);
        if (i >= 0)
        {
            try
            {
                obj = mArray[(i << 1) + 1];
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return obj;
        } else
        {
            return null;
        }
    }

    public int hashCode()
    {
        boolean flag = LruCache.a;
        int ai[] = mHashes;
        Object aobj[] = mArray;
        int i1 = mSize;
        int j = 1;
        int k = 0;
        int i = 0;
        do
        {
label0:
            {
                int l = i;
                if (k < i1)
                {
                    Object obj = aobj[j];
                    int j1 = ai[k];
                    if (obj == null)
                    {
                        l = 0;
                    } else
                    {
                        l = obj.hashCode();
                    }
                    i += l ^ j1;
                    k++;
                    if (!flag)
                    {
                        break label0;
                    }
                    l = i;
                }
                return l;
            }
            j += 2;
        } while (true);
    }

    int indexOf(Object obj, int i)
    {
        int l;
        boolean flag;
        flag = LruCache.a;
        l = mSize;
        if (l != 0) goto _L2; else goto _L1
_L1:
        int k = -1;
_L4:
        return k;
_L2:
        int j;
        int j1;
        j1 = ContainerHelpers.binarySearch(mHashes, l, i);
        if (j1 < 0)
        {
            return j1;
        }
        boolean flag1;
        try
        {
            flag1 = obj.equals(mArray[j1 << 1]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag1)
        {
            return j1;
        }
        j = j1 + 1;
_L6:
        k = j;
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        int k1 = mHashes[j];
        k = j;
        if (k1 != i)
        {
            break; /* Loop/switch isn't completed */
        }
        int i1;
        boolean flag2;
        try
        {
            flag2 = obj.equals(mArray[j << 1]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        k = j;
        if (flag2) goto _L4; else goto _L3
_L3:
        k = j + 1;
        j = k;
        if (!flag) goto _L6; else goto _L5
_L5:
        j = j1 - 1;
_L8:
        if (j < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = mHashes[j];
        if (i1 != i)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            flag2 = obj.equals(mArray[j << 1]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag2)
        {
            return j;
        }
        break MISSING_BLOCK_LABEL_190;
        obj;
        throw obj;
        obj;
        throw obj;
        j--;
        if (!flag) goto _L8; else goto _L7
_L7:
        return ~k;
    }

    public int indexOfKey(Object obj)
    {
        if (obj == null)
        {
            int i;
            try
            {
                i = indexOfNull();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return i;
        } else
        {
            return indexOf(obj, obj.hashCode());
        }
    }

    int indexOfNull()
    {
        int k;
        boolean flag;
        flag = LruCache.a;
        k = mSize;
        if (k != 0) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        int i;
        int i1;
        i1 = ContainerHelpers.binarySearch(mHashes, k, 0);
        if (i1 < 0)
        {
            return i1;
        }
        Object obj;
        try
        {
            obj = mArray[i1 << 1];
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        if (obj == null)
        {
            return i1;
        }
        i = i1 + 1;
_L6:
        j = i;
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        int j1 = mHashes[i];
        j = i;
        if (j1 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1;
        NullPointerException nullpointerexception1;
        int l;
        try
        {
            obj1 = mArray[i << 1];
        }
        catch (NullPointerException nullpointerexception2)
        {
            throw nullpointerexception2;
        }
        j = i;
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        j = i + 1;
        i = j;
        if (!flag) goto _L6; else goto _L5
_L5:
        i = i1 - 1;
_L8:
        if (i < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l = mHashes[i];
        if (l != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        NullPointerException nullpointerexception3;
        try
        {
            obj1 = mArray[i << 1];
        }
        catch (NullPointerException nullpointerexception4)
        {
            throw nullpointerexception4;
        }
        if (obj1 == null)
        {
            return i;
        }
        break MISSING_BLOCK_LABEL_163;
        nullpointerexception1;
        throw nullpointerexception1;
        nullpointerexception3;
        throw nullpointerexception3;
        i--;
        if (!flag) goto _L8; else goto _L7
_L7:
        return ~j;
    }

    int indexOfValue(Object obj)
    {
label0:
        {
            boolean flag = true;
            boolean flag1 = LruCache.a;
            int j = mSize * 2;
            Object aobj[] = mArray;
            int i = ((flag) ? 1 : 0);
            if (obj == null)
            {
                i = 1;
                do
                {
                    if (i >= j)
                    {
                        break;
                    }
                    if (aobj[i] == null)
                    {
                        return i >> 1;
                    }
                    i += 2;
                } while (!flag1);
                if (!flag1)
                {
                    break label0;
                }
                i = ((flag) ? 1 : 0);
            }
            do
            {
                if (i >= j)
                {
                    break;
                }
                boolean flag2;
                try
                {
                    flag2 = obj.equals(aobj[i]);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                if (flag2)
                {
                    return i >> 1;
                }
                i += 2;
            } while (!flag1);
        }
        return -1;
    }

    public boolean isEmpty()
    {
        int i;
        try
        {
            i = mSize;
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        return i <= 0;
    }

    public Object keyAt(int i)
    {
        return mArray[i << 1];
    }

    public Object put(Object obj, Object obj1)
    {
        int i;
        int k;
        int j;
label0:
        {
            k = 8;
            j = 0;
            if (obj == null)
            {
                i = indexOfNull();
                if (!LruCache.a)
                {
                    break label0;
                }
            }
            j = obj.hashCode();
            i = indexOf(obj, j);
        }
        if (i >= 0)
        {
            i = (i << 1) + 1;
            obj = mArray[i];
            mArray[i] = obj1;
            return obj;
        }
        int l = ~i;
        int ai[];
        Object aobj[];
        int i1;
        try
        {
            i = mSize;
            i1 = mHashes.length;
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
        if (i < i1) goto _L2; else goto _L1
_L1:
        if (mSize < 8)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        i = mSize;
        k = mSize;
        i += k >> 1;
_L3:
        ai = mHashes;
        aobj = mArray;
        int j1;
        try
        {
            allocArrays(i);
            if (mHashes.length > 0)
            {
                System.arraycopy(ai, 0, mHashes, 0, ai.length);
                System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, aobj.length);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        freeArrays(ai, aobj, mSize);
_L2:
        try
        {
            if (l < mSize)
            {
                System.arraycopy(mHashes, l, mHashes, l + 1, mSize - l);
                System.arraycopy(((Object) (mArray)), l << 1, ((Object) (mArray)), l + 1 << 1, mSize - l << 1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        mHashes[l] = j;
        mArray[l << 1] = obj;
        mArray[(l << 1) + 1] = obj1;
        mSize = mSize + 1;
        return null;
        try
        {
            j1 = mSize;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        i = k;
        if (j1 < 4)
        {
            i = 4;
        }
          goto _L3
    }

    public Object remove(Object obj)
    {
        int i = indexOfKey(obj);
        if (i >= 0)
        {
            try
            {
                obj = removeAt(i);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return obj;
        } else
        {
            return null;
        }
    }

    public Object removeAt(int i)
    {
        Object obj;
        int j;
        boolean flag;
        j = 8;
        flag = LruCache.a;
        obj = mArray[(i << 1) + 1];
        int k = mSize;
        if (k > 1)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        freeArrays(mHashes, mArray, mSize);
        mHashes = ContainerHelpers.EMPTY_INTS;
        mArray = ContainerHelpers.EMPTY_OBJECTS;
        mSize = 0;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_341;
        }
        k = mHashes.length;
        if (k <= 8)
        {
            break MISSING_BLOCK_LABEL_249;
        }
        NullPointerException nullpointerexception;
        int ai[];
        Object aobj[];
        int l;
        try
        {
            k = mSize;
            l = mHashes.length / 3;
        }
        catch (NullPointerException nullpointerexception1)
        {
            try
            {
                throw nullpointerexception1;
            }
            catch (NullPointerException nullpointerexception2)
            {
                throw nullpointerexception2;
            }
        }
        if (k >= l)
        {
            break MISSING_BLOCK_LABEL_249;
        }
        if (mSize <= 8)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        j = mSize;
        k = mSize;
        j += k >> 1;
        ai = mHashes;
        aobj = mArray;
        try
        {
            allocArrays(j);
            mSize = mSize - 1;
        }
        catch (NullPointerException nullpointerexception3)
        {
            throw nullpointerexception3;
        }
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        System.arraycopy(ai, 0, mHashes, 0, i);
        System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, i << 1);
        try
        {
            if (i < mSize)
            {
                System.arraycopy(ai, i + 1, mHashes, i, mSize - i);
                System.arraycopy(((Object) (aobj)), i + 1 << 1, ((Object) (mArray)), i << 1, mSize - i << 1);
            }
        }
        catch (NullPointerException nullpointerexception4)
        {
            throw nullpointerexception4;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_341;
        }
        try
        {
            mSize = mSize - 1;
            if (i < mSize)
            {
                System.arraycopy(mHashes, i + 1, mHashes, i, mSize - i);
                System.arraycopy(((Object) (mArray)), i + 1 << 1, ((Object) (mArray)), i << 1, mSize - i << 1);
            }
        }
        catch (NullPointerException nullpointerexception5)
        {
            throw nullpointerexception5;
        }
        mArray[mSize << 1] = null;
        mArray[(mSize << 1) + 1] = null;
        return obj;
        nullpointerexception;
        throw nullpointerexception;
        nullpointerexception;
        throw nullpointerexception;
        nullpointerexception;
        throw nullpointerexception;
    }

    public Object setValueAt(int i, Object obj)
    {
        i = (i << 1) + 1;
        Object obj1 = mArray[i];
        mArray[i] = obj;
        return obj1;
    }

    public int size()
    {
        return mSize;
    }

    public String toString()
    {
        StringBuilder stringbuilder;
        int i;
        boolean flag;
label0:
        {
            i = 0;
            flag = LruCache.a;
            String s;
            try
            {
                if (!isEmpty())
                {
                    break label0;
                }
                s = z[0];
            }
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            return s;
        }
        stringbuilder = new StringBuilder(mSize * 28);
        stringbuilder.append('{');
_L2:
        if (i >= mSize)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj;
        if (i > 0)
        {
            try
            {
                stringbuilder.append(z[3]);
            }
            catch (NullPointerException nullpointerexception1)
            {
                throw nullpointerexception1;
            }
        }
        obj = keyAt(i);
        if (obj != this)
        {
            try
            {
                stringbuilder.append(obj);
            }
            catch (NullPointerException nullpointerexception2)
            {
                throw nullpointerexception2;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_101;
            }
        }
        stringbuilder.append(z[2]);
        stringbuilder.append('=');
        obj = valueAt(i);
        if (obj != this)
        {
            try
            {
                stringbuilder.append(obj);
            }
            catch (NullPointerException nullpointerexception3)
            {
                throw nullpointerexception3;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_140;
            }
        }
        stringbuilder.append(z[1]);
        i++;
        if (!flag) goto _L2; else goto _L1
_L1:
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    public Object valueAt(int i)
    {
        return mArray[(i << 1) + 1];
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "\023f";
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
                obj = "@o02\fHV9+V";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "@o02\fHV9+V";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "D;";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 127;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 104;
          goto _L9
_L5:
        byte0 = 27;
          goto _L9
_L6:
        byte0 = 88;
          goto _L9
        byte0 = 91;
          goto _L9
    }
}
