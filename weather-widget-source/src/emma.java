// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.vladium.emma.Command;
import com.vladium.emma.EMMARuntimeException;
import java.io.PrintStream;

public final class emma
{

    private static final String EOL = System.getProperty("line.separator", "\n");
    private static final String USAGE = (new StringBuilder()).append("emma usage: emma <command> [command options],").append(EOL).append("  where <command> is one of:").append(EOL).append(EOL).append("   run     application runner {same as 'emmarun' tool};").append(EOL).append("   instr   offline instrumentation processor;").append(EOL).append("   report  offline report generator;").append(EOL).append("   merge   offline data file merge processor.").append(EOL).append(EOL).append("  {use '<command> -h' to see usage help for a given command}").append(EOL).append(EOL).append("[EMMA v0.0, build 0 (unsupported private build)]").toString();

    public emma()
    {
    }

    public static void main(String args[])
        throws EMMARuntimeException
    {
        if (args.length == 0 || args[0].startsWith("-h"))
        {
            System.out.println(USAGE);
            return;
        } else
        {
            String s = args[0];
            String args1[] = new String[args.length - 1];
            System.arraycopy(args, 1, args1, 0, args1.length);
            Command.create(s, "emma ".concat(s), args1).run();
            return;
        }
    }

}
