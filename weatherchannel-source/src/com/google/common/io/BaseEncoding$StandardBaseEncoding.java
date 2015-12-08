// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.io.IOException;
import java.math.RoundingMode;

// Referenced classes of package com.google.common.io:
//            BaseEncoding

static final class <init> extends BaseEncoding
{

    private final  alphabet;
    private transient BaseEncoding lowerCase;
    private final Character paddingChar;
    private transient BaseEncoding upperCase;

    <init> decodingStream(final <init> reader)
    {
        Preconditions.checkNotNull(reader);
        return new GwtWorkarounds.ByteInput() {

            int bitBuffer;
            int bitBufferLength;
            boolean hitPadding;
            final CharMatcher paddingMatcher;
            int readChars;
            final BaseEncoding.StandardBaseEncoding this$0;
            final GwtWorkarounds.CharInput val$reader;

            public void close()
                throws IOException
            {
                reader.close();
            }

            public int read()
                throws IOException
            {
                byte byte0 = -1;
                int i;
label0:
                do
                {
                    char c;
                    do
                    {
                        i = reader.read();
                        if (i == -1)
                        {
                            i = byte0;
                            if (!hitPadding)
                            {
                                i = byte0;
                                if (!alphabet.isValidPaddingStartPosition(readChars))
                                {
                                    i = readChars;
                                    throw new BaseEncoding.DecodingException((new StringBuilder(32)).append("Invalid input length ").append(i).toString());
                                }
                            }
                            break label0;
                        }
                        readChars = readChars + 1;
                        c = (char)i;
                        if (!paddingMatcher.matches(c))
                        {
                            break;
                        }
                        if (!hitPadding && (readChars == 1 || !alphabet.isValidPaddingStartPosition(readChars - 1)))
                        {
                            i = readChars;
                            throw new BaseEncoding.DecodingException((new StringBuilder(41)).append("Padding cannot start at index ").append(i).toString());
                        }
                        hitPadding = true;
                    } while (true);
                    if (hitPadding)
                    {
                        i = readChars;
                        throw new BaseEncoding.DecodingException((new StringBuilder(61)).append("Expected padding character but found '").append(c).append("' at index ").append(i).toString());
                    }
                    bitBuffer = bitBuffer << alphabet.bitsPerChar;
                    bitBuffer = bitBuffer | alphabet.decode(c);
                    bitBufferLength = bitBufferLength + alphabet.bitsPerChar;
                    if (bitBufferLength < 8)
                    {
                        continue;
                    }
                    bitBufferLength = bitBufferLength - 8;
                    i = bitBuffer >> bitBufferLength & 0xff;
                    break;
                } while (true);
                return i;
            }

            
            {
                this$0 = BaseEncoding.StandardBaseEncoding.this;
                reader = charinput;
                super();
                bitBuffer = 0;
                bitBufferLength = 0;
                readChars = 0;
                hitPadding = false;
                paddingMatcher = padding();
            }
        };
    }

    _cls2.bitBufferLength encodingStream(final _cls2.bitBufferLength out)
    {
        Preconditions.checkNotNull(out);
        return new GwtWorkarounds.ByteOutput() {

            int bitBuffer;
            int bitBufferLength;
            final BaseEncoding.StandardBaseEncoding this$0;
            final GwtWorkarounds.CharOutput val$out;
            int writtenChars;

            public void close()
                throws IOException
            {
                if (bitBufferLength > 0)
                {
                    int i = bitBuffer;
                    int j = alphabet.bitsPerChar;
                    int k = bitBufferLength;
                    int l = alphabet.mask;
                    out.write(alphabet.encode(i << j - k & l));
                    writtenChars = writtenChars + 1;
                    if (paddingChar != null)
                    {
                        for (; writtenChars % alphabet.charsPerChunk != 0; writtenChars = writtenChars + 1)
                        {
                            out.write(paddingChar.charValue());
                        }

                    }
                }
                out.close();
            }

            public void flush()
                throws IOException
            {
                out.flush();
            }

            public void write(byte byte0)
                throws IOException
            {
                bitBuffer = bitBuffer << 8;
                bitBuffer = bitBuffer | byte0 & 0xff;
                for (bitBufferLength = bitBufferLength + 8; bitBufferLength >= alphabet.bitsPerChar; bitBufferLength = bitBufferLength - alphabet.bitsPerChar)
                {
                    byte0 = bitBuffer;
                    int i = bitBufferLength;
                    int j = alphabet.bitsPerChar;
                    int k = alphabet.mask;
                    out.write(alphabet.encode(byte0 >> i - j & k));
                    writtenChars = writtenChars + 1;
                }

            }

            
            {
                this$0 = BaseEncoding.StandardBaseEncoding.this;
                out = charoutput;
                super();
                bitBuffer = 0;
                bitBufferLength = 0;
                writtenChars = 0;
            }
        };
    }

    public BaseEncoding lowerCase()
    {
        BaseEncoding baseencoding = lowerCase;
        Object obj = baseencoding;
        if (baseencoding == null)
        {
            obj = alphabet.alphabet();
            if (obj == alphabet)
            {
                obj = this;
            } else
            {
                obj = new <init>(((<init>) (obj)), paddingChar);
            }
            lowerCase = ((BaseEncoding) (obj));
        }
        return ((BaseEncoding) (obj));
    }

    int maxDecodedSize(int i)
    {
        return (int)(((long)alphabet.alphabet * (long)i + 7L) / 8L);
    }

    int maxEncodedSize(int i)
    {
        return alphabet.k * IntMath.divide(i, alphabet.k, RoundingMode.CEILING);
    }

    public BaseEncoding omitPadding()
    {
        if (paddingChar == null)
        {
            return this;
        } else
        {
            return new <init>(alphabet, null);
        }
    }

    CharMatcher padding()
    {
        if (paddingChar == null)
        {
            return CharMatcher.NONE;
        } else
        {
            return CharMatcher.is(paddingChar.charValue());
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("BaseEncoding.");
        stringbuilder.append(alphabet.alphabet());
        if (8 % alphabet.alphabet != 0)
        {
            if (paddingChar == null)
            {
                stringbuilder.append(".omitPadding()");
            } else
            {
                stringbuilder.append(".withPadChar(").append(paddingChar).append(')');
            }
        }
        return stringbuilder.toString();
    }

    public BaseEncoding upperCase()
    {
        BaseEncoding baseencoding = upperCase;
        Object obj = baseencoding;
        if (baseencoding == null)
        {
            obj = alphabet.alphabet();
            if (obj == alphabet)
            {
                obj = this;
            } else
            {
                obj = new <init>(((<init>) (obj)), paddingChar);
            }
            upperCase = ((BaseEncoding) (obj));
        }
        return ((BaseEncoding) (obj));
    }

    public BaseEncoding withPadChar(char c)
    {
        if (8 % alphabet.alphabet == 0 || paddingChar != null && paddingChar.charValue() == c)
        {
            return this;
        } else
        {
            return new <init>(alphabet, Character.valueOf(c));
        }
    }

    public BaseEncoding withSeparator(String s, int i)
    {
        Preconditions.checkNotNull(s);
        Preconditions.checkArgument(padding().or(alphabet).matchesNoneOf(s), "Separator cannot contain alphabet or padding characters");
        return new (this, s, i);
    }



    padding(padding padding1, Character character)
    {
        alphabet = (alphabet)Preconditions.checkNotNull(padding1);
        boolean flag;
        if (character == null || !padding1.alphabet(character.charValue()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Padding character %s was already in alphabet", new Object[] {
            character
        });
        paddingChar = character;
    }

    paddingChar(String s, String s1, Character character)
    {
        this(new <init>(s, s1.toCharArray()), character);
    }
}
