// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class hzk
    implements hzv
{

    private final hzv _flddelegate;

    public hzk(hzv hzv1)
    {
        if (hzv1 == null)
        {
            throw new IllegalArgumentException("delegate == null");
        } else
        {
            _flddelegate = hzv1;
            return;
        }
    }

    public void close()
    {
        _flddelegate.close();
    }

    public final hzv _mthdelegate()
    {
        return _flddelegate;
    }

    public void flush()
    {
        _flddelegate.flush();
    }

    public hzx timeout()
    {
        return _flddelegate.timeout();
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append("(").append(_flddelegate.toString()).append(")").toString();
    }

    public void write(hzf hzf, long l)
    {
        _flddelegate.write(hzf, l);
    }
}
