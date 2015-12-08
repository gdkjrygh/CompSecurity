// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;

// Referenced classes of package com.google.common.io:
//            GwtWorkarounds, CharSource, ByteSource, CharSink, 
//            ByteSink

public abstract class BaseEncoding
{
    private static final class Alphabet extends CharMatcher
    {

        final int bitsPerChar;
        final int bytesPerChunk;
        private final char chars[];
        final int charsPerChunk;
        private final byte decodabet[];
        final int mask;
        private final String name;
        private final boolean validPadding[];

        private boolean hasLowerCase()
        {
            char ac[] = chars;
            int j = ac.length;
            for (int i = 0; i < j; i++)
            {
                if (Ascii.isLowerCase(ac[i]))
                {
                    return true;
                }
            }

            return false;
        }

        private boolean hasUpperCase()
        {
            char ac[] = chars;
            int j = ac.length;
            for (int i = 0; i < j; i++)
            {
                if (Ascii.isUpperCase(ac[i]))
                {
                    return true;
                }
            }

            return false;
        }

        int decode(char c)
            throws IOException
        {
            if (c > '\177' || decodabet[c] == -1)
            {
                throw new DecodingException((new StringBuilder(25)).append("Unrecognized character: ").append(c).toString());
            } else
            {
                return decodabet[c];
            }
        }

        char encode(int i)
        {
            return chars[i];
        }

        boolean isValidPaddingStartPosition(int i)
        {
            return validPadding[i % charsPerChunk];
        }

        Alphabet lowerCase()
        {
            if (!hasUpperCase())
            {
                return this;
            }
            char ac[];
            boolean flag;
            if (!hasLowerCase())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Cannot call lowerCase() on a mixed-case alphabet");
            ac = new char[chars.length];
            for (int i = 0; i < chars.length; i++)
            {
                ac[i] = Ascii.toLowerCase(chars[i]);
            }

            return new Alphabet(String.valueOf(name).concat(".lowerCase()"), ac);
        }

        public boolean matches(char c)
        {
            return CharMatcher.ASCII.matches(c) && decodabet[c] != -1;
        }

        public String toString()
        {
            return name;
        }

        Alphabet upperCase()
        {
            if (!hasLowerCase())
            {
                return this;
            }
            char ac[];
            boolean flag;
            if (!hasUpperCase())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Cannot call upperCase() on a mixed-case alphabet");
            ac = new char[chars.length];
            for (int i = 0; i < chars.length; i++)
            {
                ac[i] = Ascii.toUpperCase(chars[i]);
            }

            return new Alphabet(String.valueOf(name).concat(".upperCase()"), ac);
        }

        Alphabet(String s, char ac[])
        {
            name = (String)Preconditions.checkNotNull(s);
            chars = (char[])Preconditions.checkNotNull(ac);
            int i;
            try
            {
                bitsPerChar = IntMath.log2(ac.length, RoundingMode.UNNECESSARY);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                int j = ac.length;
                throw new IllegalArgumentException((new StringBuilder(35)).append("Illegal alphabet length ").append(j).toString(), s);
            }
            i = Math.min(8, Integer.lowestOneBit(bitsPerChar));
            charsPerChunk = 8 / i;
            bytesPerChunk = bitsPerChar / i;
            mask = ac.length - 1;
            s = new byte[128];
            Arrays.fill(s, (byte)-1);
            i = 0;
            while (i < ac.length) 
            {
                char c = ac[i];
                Preconditions.checkArgument(CharMatcher.ASCII.matches(c), "Non-ASCII character: %s", new Object[] {
                    Character.valueOf(c)
                });
                boolean flag;
                if (s[c] == -1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag, "Duplicate character: %s", new Object[] {
                    Character.valueOf(c)
                });
                s[c] = (byte)i;
                i++;
            }
            decodabet = s;
            s = new boolean[charsPerChunk];
            for (int k = 0; k < bytesPerChunk; k++)
            {
                s[IntMath.divide(k * 8, bitsPerChar, RoundingMode.CEILING)] = 1;
            }

            validPadding = s;
        }
    }

    public static final class DecodingException extends IOException
    {

        DecodingException(String s)
        {
            super(s);
        }

        DecodingException(Throwable throwable)
        {
            super(throwable);
        }
    }

    static final class SeparatedBaseEncoding extends BaseEncoding
    {

        private final int afterEveryChars;
        private final BaseEncoding _flddelegate;
        private final String separator;
        private final CharMatcher separatorChars;

        GwtWorkarounds.ByteInput decodingStream(GwtWorkarounds.CharInput charinput)
        {
            return _flddelegate.decodingStream(ignoringInput(charinput, separatorChars));
        }

        GwtWorkarounds.ByteOutput encodingStream(GwtWorkarounds.CharOutput charoutput)
        {
            return _flddelegate.encodingStream(separatingOutput(charoutput, separator, afterEveryChars));
        }

        public BaseEncoding lowerCase()
        {
            return _flddelegate.lowerCase().withSeparator(separator, afterEveryChars);
        }

        int maxDecodedSize(int i)
        {
            return _flddelegate.maxDecodedSize(i);
        }

        int maxEncodedSize(int i)
        {
            i = _flddelegate.maxEncodedSize(i);
            return separator.length() * IntMath.divide(Math.max(0, i - 1), afterEveryChars, RoundingMode.FLOOR) + i;
        }

        public BaseEncoding omitPadding()
        {
            return _flddelegate.omitPadding().withSeparator(separator, afterEveryChars);
        }

        CharMatcher padding()
        {
            return _flddelegate.padding();
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(_flddelegate.toString()));
            String s1 = String.valueOf(String.valueOf(separator));
            int i = afterEveryChars;
            return (new StringBuilder(s.length() + 31 + s1.length())).append(s).append(".withSeparator(\"").append(s1).append("\", ").append(i).append(")").toString();
        }

        public BaseEncoding upperCase()
        {
            return _flddelegate.upperCase().withSeparator(separator, afterEveryChars);
        }

        public BaseEncoding withPadChar(char c)
        {
            return _flddelegate.withPadChar(c).withSeparator(separator, afterEveryChars);
        }

        public BaseEncoding withSeparator(String s, int i)
        {
            throw new UnsupportedOperationException("Already have a separator");
        }

        SeparatedBaseEncoding(BaseEncoding baseencoding, String s, int i)
        {
            _flddelegate = (BaseEncoding)Preconditions.checkNotNull(baseencoding);
            separator = (String)Preconditions.checkNotNull(s);
            afterEveryChars = i;
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Cannot add a separator after every %s chars", new Object[] {
                Integer.valueOf(i)
            });
            separatorChars = CharMatcher.anyOf(s).precomputed();
        }
    }

    static final class StandardBaseEncoding extends BaseEncoding
    {

        private final Alphabet alphabet;
        private transient BaseEncoding lowerCase;
        private final Character paddingChar;
        private transient BaseEncoding upperCase;

        GwtWorkarounds.ByteInput decodingStream(GwtWorkarounds.CharInput charinput)
        {
            Preconditions.checkNotNull(charinput);
            return charinput. new GwtWorkarounds.ByteInput() {

                int bitBuffer;
                int bitBufferLength;
                boolean hitPadding;
                final CharMatcher paddingMatcher;
                int readChars;
                final StandardBaseEncoding this$0;
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
                                        throw new DecodingException((new StringBuilder(32)).append("Invalid input length ").append(i).toString());
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
                                throw new DecodingException((new StringBuilder(41)).append("Padding cannot start at index ").append(i).toString());
                            }
                            hitPadding = true;
                        } while (true);
                        if (hitPadding)
                        {
                            i = readChars;
                            throw new DecodingException((new StringBuilder(61)).append("Expected padding character but found '").append(c).append("' at index ").append(i).toString());
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
                this$0 = final_standardbaseencoding;
                reader = GwtWorkarounds.CharInput.this;
                super();
                bitBuffer = 0;
                bitBufferLength = 0;
                readChars = 0;
                hitPadding = false;
                paddingMatcher = padding();
            }
            };
        }

        GwtWorkarounds.ByteOutput encodingStream(GwtWorkarounds.CharOutput charoutput)
        {
            Preconditions.checkNotNull(charoutput);
            return charoutput. new GwtWorkarounds.ByteOutput() {

                int bitBuffer;
                int bitBufferLength;
                final StandardBaseEncoding this$0;
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
                this$0 = final_standardbaseencoding;
                out = GwtWorkarounds.CharOutput.this;
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
                obj = alphabet.lowerCase();
                if (obj == alphabet)
                {
                    obj = this;
                } else
                {
                    obj = new StandardBaseEncoding(((Alphabet) (obj)), paddingChar);
                }
                lowerCase = ((BaseEncoding) (obj));
            }
            return ((BaseEncoding) (obj));
        }

        int maxDecodedSize(int i)
        {
            return (int)(((long)alphabet.bitsPerChar * (long)i + 7L) / 8L);
        }

        int maxEncodedSize(int i)
        {
            return alphabet.charsPerChunk * IntMath.divide(i, alphabet.bytesPerChunk, RoundingMode.CEILING);
        }

        public BaseEncoding omitPadding()
        {
            if (paddingChar == null)
            {
                return this;
            } else
            {
                return new StandardBaseEncoding(alphabet, null);
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
            stringbuilder.append(alphabet.toString());
            if (8 % alphabet.bitsPerChar != 0)
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
                obj = alphabet.upperCase();
                if (obj == alphabet)
                {
                    obj = this;
                } else
                {
                    obj = new StandardBaseEncoding(((Alphabet) (obj)), paddingChar);
                }
                upperCase = ((BaseEncoding) (obj));
            }
            return ((BaseEncoding) (obj));
        }

        public BaseEncoding withPadChar(char c)
        {
            if (8 % alphabet.bitsPerChar == 0 || paddingChar != null && paddingChar.charValue() == c)
            {
                return this;
            } else
            {
                return new StandardBaseEncoding(alphabet, Character.valueOf(c));
            }
        }

        public BaseEncoding withSeparator(String s, int i)
        {
            Preconditions.checkNotNull(s);
            Preconditions.checkArgument(padding().or(alphabet).matchesNoneOf(s), "Separator cannot contain alphabet or padding characters");
            return new SeparatedBaseEncoding(this, s, i);
        }



        StandardBaseEncoding(Alphabet alphabet1, Character character)
        {
            alphabet = (Alphabet)Preconditions.checkNotNull(alphabet1);
            boolean flag;
            if (character == null || !alphabet1.matches(character.charValue()))
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

        StandardBaseEncoding(String s, String s1, Character character)
        {
            this(new Alphabet(s, s1.toCharArray()), character);
        }
    }


    private static final BaseEncoding BASE16 = new StandardBaseEncoding("base16()", "0123456789ABCDEF", null);
    private static final BaseEncoding BASE32 = new StandardBaseEncoding("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", Character.valueOf('='));
    private static final BaseEncoding BASE32_HEX = new StandardBaseEncoding("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", Character.valueOf('='));
    private static final BaseEncoding BASE64 = new StandardBaseEncoding("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", Character.valueOf('='));
    private static final BaseEncoding BASE64_URL = new StandardBaseEncoding("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", Character.valueOf('='));

    BaseEncoding()
    {
    }

    public static BaseEncoding base16()
    {
        return BASE16;
    }

    public static BaseEncoding base32()
    {
        return BASE32;
    }

    public static BaseEncoding base32Hex()
    {
        return BASE32_HEX;
    }

    public static BaseEncoding base64()
    {
        return BASE64;
    }

    public static BaseEncoding base64Url()
    {
        return BASE64_URL;
    }

    private static byte[] extract(byte abyte0[], int i)
    {
        if (i == abyte0.length)
        {
            return abyte0;
        } else
        {
            byte abyte1[] = new byte[i];
            System.arraycopy(abyte0, 0, abyte1, 0, i);
            return abyte1;
        }
    }

    static GwtWorkarounds.CharInput ignoringInput(GwtWorkarounds.CharInput charinput, CharMatcher charmatcher)
    {
        Preconditions.checkNotNull(charinput);
        Preconditions.checkNotNull(charmatcher);
        return new GwtWorkarounds.CharInput(charinput, charmatcher) {

            final GwtWorkarounds.CharInput val$delegate;
            final CharMatcher val$toIgnore;

            public void close()
                throws IOException
            {
                delegate.close();
            }

            public int read()
                throws IOException
            {
                int i;
                do
                {
                    i = delegate.read();
                } while (i != -1 && toIgnore.matches((char)i));
                return i;
            }

            
            {
                delegate = charinput;
                toIgnore = charmatcher;
                super();
            }
        };
    }

    static GwtWorkarounds.CharOutput separatingOutput(GwtWorkarounds.CharOutput charoutput, String s, int i)
    {
        Preconditions.checkNotNull(charoutput);
        Preconditions.checkNotNull(s);
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return new GwtWorkarounds.CharOutput(i, s, charoutput) {

            int charsUntilSeparator;
            final int val$afterEveryChars;
            final GwtWorkarounds.CharOutput val$delegate;
            final String val$separator;

            public void close()
                throws IOException
            {
                delegate.close();
            }

            public void flush()
                throws IOException
            {
                delegate.flush();
            }

            public void write(char c)
                throws IOException
            {
                if (charsUntilSeparator == 0)
                {
                    for (int j = 0; j < separator.length(); j++)
                    {
                        delegate.write(separator.charAt(j));
                    }

                    charsUntilSeparator = afterEveryChars;
                }
                delegate.write(c);
                charsUntilSeparator = charsUntilSeparator - 1;
            }

            
            {
                afterEveryChars = i;
                separator = s;
                delegate = charoutput;
                super();
                charsUntilSeparator = afterEveryChars;
            }
        };
    }

    public final byte[] decode(CharSequence charsequence)
    {
        try
        {
            charsequence = decodeChecked(charsequence);
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw new IllegalArgumentException(charsequence);
        }
        return charsequence;
    }

    final byte[] decodeChecked(CharSequence charsequence)
        throws DecodingException
    {
        byte abyte0[];
        int i;
        String s = padding().trimTrailingFrom(charsequence);
        charsequence = decodingStream(GwtWorkarounds.asCharInput(s));
        abyte0 = new byte[maxDecodedSize(s.length())];
        int j;
        try
        {
            j = charsequence.read();
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw new AssertionError(charsequence);
        }
        i = 0;
        if (j == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        abyte0[i] = (byte)j;
        j = charsequence.read();
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_41;
_L1:
        return extract(abyte0, i);
    }

    public final ByteSource decodingSource(final CharSource encodedSource)
    {
        Preconditions.checkNotNull(encodedSource);
        return new ByteSource() {

            final BaseEncoding this$0;
            final CharSource val$encodedSource;

            public InputStream openStream()
                throws IOException
            {
                return decodingStream(encodedSource.openStream());
            }

            
            {
                this$0 = BaseEncoding.this;
                encodedSource = charsource;
                super();
            }
        };
    }

    abstract GwtWorkarounds.ByteInput decodingStream(GwtWorkarounds.CharInput charinput);

    public final InputStream decodingStream(Reader reader)
    {
        return GwtWorkarounds.asInputStream(decodingStream(GwtWorkarounds.asCharInput(reader)));
    }

    public String encode(byte abyte0[])
    {
        return encode((byte[])Preconditions.checkNotNull(abyte0), 0, abyte0.length);
    }

    public final String encode(byte abyte0[], int i, int j)
    {
        Preconditions.checkNotNull(abyte0);
        Preconditions.checkPositionIndexes(i, i + j, abyte0.length);
        GwtWorkarounds.CharOutput charoutput = GwtWorkarounds.stringBuilderOutput(maxEncodedSize(j));
        GwtWorkarounds.ByteOutput byteoutput = encodingStream(charoutput);
        int k = 0;
        while (k < j) 
        {
            try
            {
                byteoutput.write(abyte0[i + k]);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new AssertionError("impossible");
            }
            k++;
        }
        byteoutput.close();
        return charoutput.toString();
    }

    public final ByteSink encodingSink(final CharSink encodedSink)
    {
        Preconditions.checkNotNull(encodedSink);
        return new ByteSink() {

            final BaseEncoding this$0;
            final CharSink val$encodedSink;

            public OutputStream openStream()
                throws IOException
            {
                return encodingStream(encodedSink.openStream());
            }

            
            {
                this$0 = BaseEncoding.this;
                encodedSink = charsink;
                super();
            }
        };
    }

    abstract GwtWorkarounds.ByteOutput encodingStream(GwtWorkarounds.CharOutput charoutput);

    public final OutputStream encodingStream(Writer writer)
    {
        return GwtWorkarounds.asOutputStream(encodingStream(GwtWorkarounds.asCharOutput(writer)));
    }

    public abstract BaseEncoding lowerCase();

    abstract int maxDecodedSize(int i);

    abstract int maxEncodedSize(int i);

    public abstract BaseEncoding omitPadding();

    abstract CharMatcher padding();

    public abstract BaseEncoding upperCase();

    public abstract BaseEncoding withPadChar(char c);

    public abstract BaseEncoding withSeparator(String s, int i);

}
