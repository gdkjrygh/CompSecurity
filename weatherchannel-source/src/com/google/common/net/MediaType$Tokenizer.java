// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.net;

import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.net:
//            MediaType

private static final class input
{

    final String input;
    int position;

    char consumeCharacter(char c)
    {
        Preconditions.checkState(hasMore());
        boolean flag;
        if (previewChar() == c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        position = position + 1;
        return c;
    }

    char consumeCharacter(CharMatcher charmatcher)
    {
        Preconditions.checkState(hasMore());
        char c = previewChar();
        Preconditions.checkState(charmatcher.matches(c));
        position = position + 1;
        return c;
    }

    String consumeToken(CharMatcher charmatcher)
    {
        int i = position;
        charmatcher = consumeTokenIfPresent(charmatcher);
        boolean flag;
        if (position != i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        return charmatcher;
    }

    String consumeTokenIfPresent(CharMatcher charmatcher)
    {
        Preconditions.checkState(hasMore());
        int i = position;
        position = charmatcher.negate().indexIn(input, i);
        if (hasMore())
        {
            return input.substring(i, position);
        } else
        {
            return input.substring(i);
        }
    }

    boolean hasMore()
    {
        return position >= 0 && position < input.length();
    }

    char previewChar()
    {
        Preconditions.checkState(hasMore());
        return input.charAt(position);
    }

    (String s)
    {
        position = 0;
        input = s;
    }
}
