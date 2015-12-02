// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.Context;
import android.support.v4.util.DebugUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class Loader
{

    public static boolean a;
    private static final String z[];
    boolean mAbandoned;
    boolean mContentChanged;
    Context mContext;
    int mId;
    OnLoadCompleteListener mListener;
    boolean mProcessingChange;
    boolean mReset;
    boolean mStarted;

    public Loader(Context context)
    {
        mStarted = false;
        mAbandoned = false;
        mReset = true;
        mContentChanged = false;
        mProcessingChange = false;
        mContext = context.getApplicationContext();
    }

    public void abandon()
    {
        mAbandoned = true;
        onAbandon();
    }

    public String dataToString(Object obj)
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        DebugUtils.buildShortClassTag(obj, stringbuilder);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public void deliverResult(Object obj)
    {
        try
        {
            if (mListener != null)
            {
                mListener.onLoadComplete(this, obj);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        boolean flag;
        try
        {
            printwriter.print(s);
            printwriter.print(z[0]);
            printwriter.print(mId);
            printwriter.print(z[6]);
            printwriter.println(mListener);
            flag = mStarted;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
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
        if (flag)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        flag = mContentChanged;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        if (!mProcessingChange)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        printwriter.print(s);
        printwriter.print(z[1]);
        printwriter.print(mStarted);
        printwriter.print(z[4]);
        printwriter.print(mContentChanged);
        printwriter.print(z[2]);
        printwriter.println(mProcessingChange);
        try
        {
            flag = mAbandoned;
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
        if (flag)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        if (!mReset)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        printwriter.print(s);
        printwriter.print(z[3]);
        printwriter.print(mAbandoned);
        printwriter.print(z[5]);
        printwriter.println(mReset);
    }

    public int getId()
    {
        return mId;
    }

    public boolean isAbandoned()
    {
        return mAbandoned;
    }

    public boolean isStarted()
    {
        return mStarted;
    }

    protected void onAbandon()
    {
    }

    protected void onReset()
    {
    }

    protected void onStartLoading()
    {
    }

    protected void onStopLoading()
    {
    }

    public void registerListener(int i, OnLoadCompleteListener onloadcompletelistener)
    {
        try
        {
            if (mListener != null)
            {
                throw new IllegalStateException(z[7]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (OnLoadCompleteListener onloadcompletelistener)
        {
            throw onloadcompletelistener;
        }
        mListener = onloadcompletelistener;
        mId = i;
    }

    public void reset()
    {
        onReset();
        mReset = true;
        mStarted = false;
        mAbandoned = false;
        mContentChanged = false;
        mProcessingChange = false;
    }

    public final void startLoading()
    {
        mStarted = true;
        mReset = false;
        mAbandoned = false;
        onStartLoading();
    }

    public void stopLoading()
    {
        mStarted = false;
        onStopLoading();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        DebugUtils.buildShortClassTag(this, stringbuilder);
        stringbuilder.append(z[10]);
        stringbuilder.append(mId);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public void unregisterListener(OnLoadCompleteListener onloadcompletelistener)
    {
        try
        {
            if (mListener == null)
            {
                throw new IllegalStateException(z[8]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (OnLoadCompleteListener onloadcompletelistener)
        {
            throw onloadcompletelistener;
        }
        try
        {
            if (mListener != onloadcompletelistener)
            {
                throw new IllegalArgumentException(z[9]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (OnLoadCompleteListener onloadcompletelistener)
        {
            throw onloadcompletelistener;
        }
        mListener = null;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[11];
        obj = "E!Py";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "E;@%\021\\\rPy";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\b\005d6\fK\rG7\nF\017w,\002F\017Qy";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "E)V%\rL\007Z!\007\025";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\b\005w+\r\\\rZ0 @\tZ#\006LU";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\b\005f!\020M\034\t";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\b\005x-\020\\\rZ!\021\025";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "|\000Q6\006\b\001Gd\002D\032Q%\007QHUd\017A\033@!\rM\032\0246\006O\001G0\006Z\rP";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "f\007\024(\n[\034Q*\006ZHF!\004A\033@!\021";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "i\034@!\016X\034]*\004\b\034[d\026F\032Q#\n[\034Q6C\\\000Qd\024Z\007Z#CD\001G0\006F\rF";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\b\001Py";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 324
    //                   0 347
    //                   1 354
    //                   2 361
    //                   3 368;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_368;
_L3:
        byte byte1 = 99;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 40;
          goto _L9
_L5:
        byte1 = 104;
          goto _L9
_L6:
        byte1 = 52;
          goto _L9
        byte1 = 68;
          goto _L9
    }

    private class OnLoadCompleteListener
    {

        public abstract void onLoadComplete(Loader loader, Object obj);
    }

}
