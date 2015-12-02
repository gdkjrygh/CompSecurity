// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

// Referenced classes of package android.support.v4.content:
//            ModernAsyncTask

class this._cls0 extends FutureTask
{

    private static final String z[];
    final ModernAsyncTask this$0;

    protected void done()
    {
        try
        {
            Object obj = get();
            ModernAsyncTask.access$400(ModernAsyncTask.this, obj);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Log.w(z[0], interruptedexception);
            return;
        }
        catch (ExecutionException executionexception)
        {
            throw new RuntimeException(z[2], executionexception.getCause());
        }
        catch (CancellationException cancellationexception)
        {
            ModernAsyncTask.access$400(ModernAsyncTask.this, null);
        }
        catch (Throwable throwable)
        {
            throw new RuntimeException(z[1], throwable);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "a\031m Nt\013g%";
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
                obj = "a\0044+_R\005fnBC\ta<HDJc&DL\0174+UE\ta:DN\r4*Bi\004V/NK\rf!XN\016<g";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "a\0044+_R\005fnBC\ta<HDJc&DL\0174+UE\ta:DN\r4*Bi\004V/NK\rf!XN\016<g";
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
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 45;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 32;
          goto _L9
_L5:
        byte0 = 106;
          goto _L9
_L6:
        byte0 = 20;
          goto _L9
        byte0 = 78;
          goto _L9
    }

    (Callable callable)
    {
        this$0 = ModernAsyncTask.this;
        super(callable);
    }
}
