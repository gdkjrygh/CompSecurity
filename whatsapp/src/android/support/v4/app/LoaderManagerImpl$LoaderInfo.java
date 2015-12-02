// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.Loader;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.SparseArrayCompat;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

// Referenced classes of package android.support.v4.app:
//            LoaderManagerImpl, FragmentActivity, FragmentManagerImpl

final class mCallbacks
    implements android.support.v4.content.
{

    private static final String z[];
    final Bundle mArgs;
     mCallbacks;
    Object mData;
    boolean mDeliveredData;
    boolean mDestroyed;
    boolean mHaveData;
    final int mId;
    boolean mListenerRegistered;
    Loader mLoader;
     mPendingLoader;
    boolean mReportNextStart;
    boolean mRetaining;
    boolean mRetainingStarted;
    boolean mStarted;
    final LoaderManagerImpl this$0;

    void callOnLoadFinished(Loader loader, Object obj)
    {
        if (mCallbacks == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        String s;
        if (mActivity != null)
        {
            s = mActivity.mFragments.mNoTransactionsBecause;
            mActivity.mFragments.mNoTransactionsBecause = z[26];
        } else
        {
            s = null;
        }
        if (LoaderManagerImpl.DEBUG)
        {
            Log.v(z[28], (new StringBuilder()).append(z[27]).append(loader).append(z[29]).append(loader.dataToString(obj)).toString());
        }
        mCallbacks.onLoadFinished(loader, obj);
        if (mActivity != null)
        {
            mActivity.mFragments.mNoTransactionsBecause = s;
        }
        mDeliveredData = true;
        return;
        loader;
        throw loader;
        loader;
        try
        {
            if (mActivity != null)
            {
                mActivity.mFragments.mNoTransactionsBecause = s;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Loader loader)
        {
            throw loader;
        }
        throw loader;
    }

    void destroy()
    {
        Loader loader;
        boolean flag;
        boolean flag1;
        try
        {
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v(z[34], (new StringBuilder()).append(z[36]).append(this).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        mDestroyed = true;
        flag = mDeliveredData;
        mDeliveredData = false;
        if (mCallbacks == null)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        loader = mLoader;
        if (loader == null)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        flag1 = mHaveData;
        if (!flag1 || !flag)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        flag = LoaderManagerImpl.DEBUG;
        Object obj;
        if (flag)
        {
            try
            {
                Log.v(z[33], (new StringBuilder()).append(z[32]).append(this).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        Exception exception;
        if (mActivity != null)
        {
            obj = mActivity.mFragments.mNoTransactionsBecause;
            mActivity.mFragments.mNoTransactionsBecause = z[35];
        } else
        {
            obj = null;
        }
        mCallbacks.onLoaderReset(mLoader);
        if (mActivity != null)
        {
            mActivity.mFragments.mNoTransactionsBecause = ((String) (obj));
        }
        mCallbacks = null;
        mData = null;
        mHaveData = false;
        obj = mLoader;
        if (obj != null)
        {
            try
            {
                if (mListenerRegistered)
                {
                    mListenerRegistered = false;
                    mLoader.unregisterListener(this);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            mLoader.reset();
        }
        try
        {
            if (mPendingLoader != null)
            {
                mPendingLoader.destroy();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
        exception;
        try
        {
            if (mActivity != null)
            {
                mActivity.mFragments.mNoTransactionsBecause = ((String) (obj));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        throw exception;
        obj;
        throw obj;
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        boolean flag;
        try
        {
            printwriter.print(s);
            printwriter.print(z[8]);
            printwriter.print(mId);
            printwriter.print(z[12]);
            printwriter.println(mArgs);
            printwriter.print(s);
            printwriter.print(z[20]);
            printwriter.println(mCallbacks);
            printwriter.print(s);
            printwriter.print(z[14]);
            printwriter.println(mLoader);
            if (mLoader != null)
            {
                mLoader.dump((new StringBuilder()).append(s).append(z[13]).toString(), filedescriptor, printwriter, as);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            flag = mHaveData;
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
            break MISSING_BLOCK_LABEL_146;
        }
        if (!mDeliveredData)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        printwriter.print(s);
        printwriter.print(z[16]);
        printwriter.print(mHaveData);
        printwriter.print(z[22]);
        printwriter.println(mDeliveredData);
        printwriter.print(s);
        printwriter.print(z[11]);
        printwriter.println(mData);
        try
        {
            printwriter.print(s);
            printwriter.print(z[15]);
            printwriter.print(mStarted);
            printwriter.print(z[9]);
            printwriter.print(mReportNextStart);
            printwriter.print(z[18]);
            printwriter.println(mDestroyed);
            printwriter.print(s);
            printwriter.print(z[19]);
            printwriter.print(mRetaining);
            printwriter.print(z[23]);
            printwriter.print(mRetainingStarted);
            printwriter.print(z[21]);
            printwriter.println(mListenerRegistered);
            if (mPendingLoader != null)
            {
                printwriter.print(s);
                printwriter.println(z[17]);
                printwriter.print(mPendingLoader);
                printwriter.println(":");
                mPendingLoader.dump((new StringBuilder()).append(s).append(z[10]).toString(), filedescriptor, printwriter, as);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
    }

    void finishRetain()
    {
        boolean flag = mRetaining;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        IllegalArgumentException illegalargumentexception;
        boolean flag1;
        try
        {
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v(z[30], (new StringBuilder()).append(z[31]).append(this).toString());
            }
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        mRetaining = false;
        flag = mStarted;
        flag1 = mRetainingStarted;
        if (flag != flag1)
        {
            try
            {
                if (!mStarted)
                {
                    stop();
                }
            }
            // Misplaced declaration of an exception variable
            catch (IllegalArgumentException illegalargumentexception2)
            {
                throw illegalargumentexception2;
            }
        }
        flag = mStarted;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        IllegalArgumentException illegalargumentexception2;
        try
        {
            flag = mHaveData;
        }
        catch (IllegalArgumentException illegalargumentexception3)
        {
            try
            {
                throw illegalargumentexception3;
            }
            catch (IllegalArgumentException illegalargumentexception4)
            {
                throw illegalargumentexception4;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        if (!mReportNextStart)
        {
            callOnLoadFinished(mLoader, mData);
        }
        return;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception2;
        throw illegalargumentexception2;
        illegalargumentexception2;
        throw illegalargumentexception2;
    }

    public void onLoadComplete(Loader loader, Object obj)
    {
        boolean flag;
        try
        {
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v(z[3], (new StringBuilder()).append(z[2]).append(this).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Loader loader)
        {
            throw loader;
        }
        try
        {
            flag = mDestroyed;
        }
        // Misplaced declaration of an exception variable
        catch (Loader loader)
        {
            try
            {
                throw loader;
            }
            // Misplaced declaration of an exception variable
            catch (Loader loader)
            {
                throw loader;
            }
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        if (LoaderManagerImpl.DEBUG)
        {
            Log.v(z[0], z[4]);
        }
_L4:
        return;
_L2:
        Object obj1;
        try
        {
            obj1 = mLoaders.get(mId);
        }
        // Misplaced declaration of an exception variable
        catch (Loader loader)
        {
            try
            {
                throw loader;
            }
            // Misplaced declaration of an exception variable
            catch (Loader loader)
            {
                throw loader;
            }
        }
        if (obj1 == this)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        if (!LoaderManagerImpl.DEBUG) goto _L4; else goto _L3
_L3:
        Log.v(z[1], z[6]);
        return;
        mData mdata = mPendingLoader;
        if (mdata != null)
        {
            try
            {
                if (LoaderManagerImpl.DEBUG)
                {
                    Log.v(z[7], (new StringBuilder()).append(z[5]).append(mdata).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (Loader loader)
            {
                throw loader;
            }
            mPendingLoader = null;
            mLoaders.put(mId, null);
            destroy();
            installLoader(mdata);
            return;
        }
        Object obj2 = mData;
        if (obj2 != obj)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        boolean flag1 = mHaveData;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        try
        {
            mData = obj;
            mHaveData = true;
            if (mStarted)
            {
                callOnLoadFinished(loader, obj);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Loader loader)
        {
            throw loader;
        }
        loader = (callOnLoadFinished)mInactiveLoaders.get(mId);
        if (loader != null && loader != this)
        {
            try
            {
                loader.mDeliveredData = false;
                loader.destroy();
                mInactiveLoaders.remove(mId);
            }
            // Misplaced declaration of an exception variable
            catch (Loader loader)
            {
                throw loader;
            }
        }
        loader = mActivity;
        if (loader == null) goto _L4; else goto _L5
_L5:
        if (hasRunningLoaders()) goto _L4; else goto _L6
_L6:
        mActivity.mFragments.startPendingDeferredFragments();
        return;
        loader;
        throw loader;
        loader;
        try
        {
            throw loader;
        }
        // Misplaced declaration of an exception variable
        catch (Loader loader) { }
        throw loader;
        loader;
        throw loader;
    }

    void reportStart()
    {
        boolean flag = mStarted;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        IllegalArgumentException illegalargumentexception;
        try
        {
            flag = mReportNextStart;
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            try
            {
                throw illegalargumentexception1;
            }
            catch (IllegalArgumentException illegalargumentexception2)
            {
                throw illegalargumentexception2;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        mReportNextStart = false;
        if (mHaveData)
        {
            callOnLoadFinished(mLoader, mData);
        }
        return;
        illegalargumentexception;
        throw illegalargumentexception;
    }

    void retain()
    {
        try
        {
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v(z[41], (new StringBuilder()).append(z[42]).append(this).toString());
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        mRetaining = true;
        mRetainingStarted = mStarted;
        mStarted = false;
        mCallbacks = null;
    }

    void start()
    {
        boolean flag = mRetaining;
        IllegalArgumentException illegalargumentexception;
        if (flag)
        {
            try
            {
                if (mRetainingStarted)
                {
                    mStarted = true;
                    return;
                }
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        break MISSING_BLOCK_LABEL_28;
        illegalargumentexception;
        throw illegalargumentexception;
        Loader loader;
        IllegalArgumentException illegalargumentexception2;
        boolean flag1;
        try
        {
            flag1 = mStarted;
        }
        catch (IllegalArgumentException illegalargumentexception3)
        {
            throw illegalargumentexception3;
        }
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        try
        {
            mStarted = true;
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v(z[44], (new StringBuilder()).append(z[45]).append(this).toString());
            }
        }
        catch (IllegalArgumentException illegalargumentexception4)
        {
            throw illegalargumentexception4;
        }
        loader = mLoader;
        IllegalArgumentException illegalargumentexception5;
        if (loader == null)
        {
            try
            {
                if (mCallbacks != null)
                {
                    mLoader = mCallbacks.onCreateLoader(mId, mArgs);
                }
            }
            // Misplaced declaration of an exception variable
            catch (IllegalArgumentException illegalargumentexception5)
            {
                throw illegalargumentexception5;
            }
        }
        loader = mLoader;
        if (loader == null)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        flag1 = mLoader.getClass().isMemberClass();
        if (flag1)
        {
            try
            {
                if (!Modifier.isStatic(mLoader.getClass().getModifiers()))
                {
                    throw new IllegalArgumentException((new StringBuilder()).append(z[43]).append(mLoader).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (IllegalArgumentException illegalargumentexception2)
            {
                throw illegalargumentexception2;
            }
        }
        break MISSING_BLOCK_LABEL_213;
        illegalargumentexception5;
        throw illegalargumentexception5;
        illegalargumentexception5;
        throw illegalargumentexception5;
        illegalargumentexception5;
        throw illegalargumentexception5;
        try
        {
            if (!mListenerRegistered)
            {
                mLoader.registerListener(mId, this);
                mListenerRegistered = true;
            }
        }
        catch (IllegalArgumentException illegalargumentexception6)
        {
            throw illegalargumentexception6;
        }
        mLoader.startLoading();
        return;
    }

    void stop()
    {
        boolean flag;
        try
        {
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v(z[25], (new StringBuilder()).append(z[24]).append(this).toString());
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        mStarted = false;
        flag = mRetaining;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        Loader loader;
        IllegalArgumentException illegalargumentexception1;
        try
        {
            loader = mLoader;
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            try
            {
                throw illegalargumentexception2;
            }
            catch (IllegalArgumentException illegalargumentexception3)
            {
                throw illegalargumentexception3;
            }
        }
        if (loader == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        if (mListenerRegistered)
        {
            mListenerRegistered = false;
            mLoader.unregisterListener(this);
            mLoader.stopLoading();
        }
        return;
        illegalargumentexception1;
        throw illegalargumentexception1;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        stringbuilder.append(z[39]);
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(z[37]);
        stringbuilder.append(mId);
        stringbuilder.append(z[40]);
        DebugUtils.buildShortClassTag(mLoader, stringbuilder);
        stringbuilder.append(z[38]);
        return stringbuilder.toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[46];
        obj = "H7\017 *v\025\017*.c=\034";
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
                obj = "H7\017 *v\025\017*.c=\034";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "k6\"+.`\033\001)?h=\032!u$";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "H7\017 *v\025\017*.c=\034";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "$x'#!k*\007*($4\001%+$;\001)?h=\032!o)uN *w,\034+6a<";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "$x=3&p;\006-!cx\032+ot=\000 &j?N( e<\0136u$";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "$x'#!k*\007*($4\001%+$;\001)?h=\032!o)uN* px\017';m.\013";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "H7\017 *v\025\017*.c=\034";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "i\021\ny";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "$5<!?k*\032\n*|,=0.v,S";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "$x";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "i\034\0170.9";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "$5/6(we";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "$x";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "i\024\001%+a*S";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "i\013\032%=p=\ny";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "i\020\0172*@9\032%r";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "T=\000 &j?N\b e<\0136o";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "$5*!<p*\001=*`e";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "i\n\0130.m6\007*(9";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "i\033\017(#f9\r/<9";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "$5\"-<p=\000!=V=\t-<p=\034!+9";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "$x\003\000*h1\030!=a<*%;ee";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "$5<!;e1\000-!c\013\032%=p=\ny";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "$x=0 t(\007*(>x";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "H7\017 *v\025\017*.c=\034";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "k6\"+.`\036\007*&w0\013 ";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "$x\001*\003k9\n\002&j1\035,*`x\007*o";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "H7\017 *v\025\017*.c=\034";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = ">x";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "H7\017 *v\025\017*.c=\034";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "$x(-!m+\006!+$\n\0130.m6\007*(>x";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "$x<!<a,\007*(>x";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "H7\017 *v\025\017*.c=\034";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 34;
                obj = "H7\017 *v\025\017*.c=\034";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "k6\"+.`=\034\026*w=\032";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i] = ((String) (obj));
                i = 36;
                obj = "$x*!<p*\001=&j?Td";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i] = ((String) (obj));
                i = 37;
                obj = "${";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i] = ((String) (obj));
                i = 38;
                obj = "y%";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i] = ((String) (obj));
                i = 39;
                obj = "H7\017 *v\021\000\" \177";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i] = ((String) (obj));
                i = 40;
                obj = "$bN";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i] = ((String) (obj));
                i = 41;
                obj = "H7\017 *v\025\017*.c=\034";
                byte0 = 40;
                break;

            case 40: // '('
                as1[i] = ((String) (obj));
                i = 42;
                obj = "$x<!;e1\000-!cbN";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[i] = ((String) (obj));
                i = 43;
                obj = "K:\004!,px\034!;q*\000!+$>\034+\"$7\000\007=a9\032!\003k9\n!=$5\0337;$6\0010of=N%oj7\000i<p9\032-,$1\000**vx\003!\"f=\034d,h9\0357u$";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[i] = ((String) (obj));
                i = 44;
                obj = "H7\017 *v\025\017*.c=\034";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[i] = ((String) (obj));
                i = 45;
                obj = "$x=0.v,\007*(>x";
                byte0 = 44;
                break;

            case 44: // ','
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 1092
    //                   0 1115
    //                   1 1121
    //                   2 1128
    //                   3 1135;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1135;
_L3:
        byte byte1 = 79;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 4;
          goto _L9
_L5:
        byte1 = 88;
          goto _L9
_L6:
        byte1 = 110;
          goto _L9
        byte1 = 68;
          goto _L9
    }

    public (int i, Bundle bundle,  )
    {
        this$0 = LoaderManagerImpl.this;
        super();
        mId = i;
        mArgs = bundle;
        mCallbacks = ;
    }
}
