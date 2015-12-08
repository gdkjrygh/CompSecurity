// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.content.Context;
import android.content.res.Resources;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package android.support.v8.renderscript:
//            Script, RenderScript, ScriptCThunker, RenderScriptThunker, 
//            RSRuntimeException

public class ScriptC extends Script
{

    private static final String TAG = "ScriptC";

    protected ScriptC(int i, RenderScript renderscript)
    {
        super(i, renderscript);
    }

    protected ScriptC(RenderScript renderscript, Resources resources, int i)
    {
        super(0, renderscript);
        if (RenderScript.isNative)
        {
            mT = new ScriptCThunker((RenderScriptThunker)renderscript, resources, i);
            return;
        }
        i = internalCreate(renderscript, resources, i);
        if (i == 0)
        {
            throw new RSRuntimeException("Loading of ScriptC script failed.");
        } else
        {
            setID(i);
            return;
        }
    }

    private static int internalCreate(RenderScript renderscript, Resources resources, int i)
    {
        android/support/v8/renderscript/ScriptC;
        JVM INSTR monitorenter ;
        InputStream inputstream = resources.openRawResource(i);
        byte abyte0[] = new byte[1024];
        int j = 0;
_L2:
        int l = abyte0.length - j;
        byte abyte1[];
        int k;
        k = l;
        abyte1 = abyte0;
        if (l != 0)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        abyte1 = new byte[abyte0.length * 2];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
        k = abyte1.length - j;
        k = inputstream.read(abyte1, j, k);
        if (k > 0)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        inputstream.close();
        i = renderscript.nScriptCCreate(resources.getResourceEntryName(i), renderscript.getApplicationContext().getCacheDir().toString(), abyte1, j);
        android/support/v8/renderscript/ScriptC;
        JVM INSTR monitorexit ;
        return i;
        j += k;
        abyte0 = abyte1;
        if (true) goto _L2; else goto _L1
_L1:
        renderscript;
        try
        {
            inputstream.close();
            throw renderscript;
        }
        // Misplaced declaration of an exception variable
        catch (RenderScript renderscript) { }
        finally
        {
            android/support/v8/renderscript/ScriptC;
        }
        throw new android.content.res.Resources.NotFoundException();
        throw renderscript;
    }
}
