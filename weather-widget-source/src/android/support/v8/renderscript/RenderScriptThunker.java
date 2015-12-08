// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.content.Context;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;

// Referenced classes of package android.support.v8.renderscript:
//            RenderScript, ExceptionThunker, RSInvalidStateException

class RenderScriptThunker extends android.support.v8.renderscript.RenderScript
{

    RenderScript mN;

    RenderScriptThunker(Context context)
    {
        super(context);
        isNative = true;
    }

    public static android.support.v8.renderscript.RenderScript create(Context context, int i)
    {
        RenderScriptThunker renderscriptthunker;
        try
        {
            renderscriptthunker = new RenderScriptThunker(context);
            renderscriptthunker.mN = RenderScript.create(context, i);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw ExceptionThunker.convertException(context);
        }
        return renderscriptthunker;
    }

    public void contextDump()
    {
        try
        {
            mN.contextDump();
            return;
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
    }

    public void destroy()
    {
        try
        {
            mN.destroy();
            mN = null;
            return;
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
    }

    public void finish()
    {
        try
        {
            mN.finish();
            return;
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
    }

    public void setPriority(RenderScript.Priority priority)
    {
        try
        {
            if (priority == RenderScript.Priority.LOW)
            {
                mN.setPriority(android.renderscript.RenderScript.Priority.LOW);
            }
            if (priority == RenderScript.Priority.NORMAL)
            {
                mN.setPriority(android.renderscript.RenderScript.Priority.NORMAL);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RenderScript.Priority priority)
        {
            throw ExceptionThunker.convertException(priority);
        }
    }

    void validate()
    {
        if (mN == null)
        {
            throw new RSInvalidStateException("Calling RS with no Context active.");
        } else
        {
            return;
        }
    }
}
