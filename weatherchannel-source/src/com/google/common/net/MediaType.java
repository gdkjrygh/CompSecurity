// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.net;

import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Charsets;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class MediaType
{
    private static final class Tokenizer
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

        Tokenizer(String s)
        {
            position = 0;
            input = s;
        }
    }


    public static final MediaType ANY_APPLICATION_TYPE = createConstant("application", "*");
    public static final MediaType ANY_AUDIO_TYPE = createConstant("audio", "*");
    public static final MediaType ANY_IMAGE_TYPE = createConstant("image", "*");
    public static final MediaType ANY_TEXT_TYPE = createConstant("text", "*");
    public static final MediaType ANY_TYPE = createConstant("*", "*");
    public static final MediaType ANY_VIDEO_TYPE = createConstant("video", "*");
    public static final MediaType APPLE_MOBILE_CONFIG = createConstant("application", "x-apple-aspen-config");
    public static final MediaType APPLICATION_BINARY = createConstant("application", "binary");
    private static final String APPLICATION_TYPE = "application";
    public static final MediaType APPLICATION_XML_UTF_8 = createConstantUtf8("application", "xml");
    public static final MediaType ATOM_UTF_8 = createConstantUtf8("application", "atom+xml");
    private static final String AUDIO_TYPE = "audio";
    public static final MediaType BMP = createConstant("image", "bmp");
    public static final MediaType BZIP2 = createConstant("application", "x-bzip2");
    public static final MediaType CACHE_MANIFEST_UTF_8 = createConstantUtf8("text", "cache-manifest");
    private static final String CHARSET_ATTRIBUTE = "charset";
    public static final MediaType CRW = createConstant("image", "x-canon-crw");
    public static final MediaType CSS_UTF_8 = createConstantUtf8("text", "css");
    public static final MediaType CSV_UTF_8 = createConstantUtf8("text", "csv");
    public static final MediaType EOT = createConstant("application", "vnd.ms-fontobject");
    public static final MediaType EPUB = createConstant("application", "epub+zip");
    public static final MediaType FORM_DATA = createConstant("application", "x-www-form-urlencoded");
    public static final MediaType GIF = createConstant("image", "gif");
    public static final MediaType GZIP = createConstant("application", "x-gzip");
    public static final MediaType HTML_UTF_8 = createConstantUtf8("text", "html");
    public static final MediaType ICO = createConstant("image", "vnd.microsoft.icon");
    private static final String IMAGE_TYPE = "image";
    public static final MediaType I_CALENDAR_UTF_8 = createConstantUtf8("text", "calendar");
    public static final MediaType JAVASCRIPT_UTF_8 = createConstantUtf8("application", "javascript");
    public static final MediaType JPEG = createConstant("image", "jpeg");
    public static final MediaType JSON_UTF_8 = createConstantUtf8("application", "json");
    public static final MediaType KEY_ARCHIVE = createConstant("application", "pkcs12");
    public static final MediaType KML = createConstant("application", "vnd.google-earth.kml+xml");
    public static final MediaType KMZ = createConstant("application", "vnd.google-earth.kmz");
    private static final Map KNOWN_TYPES = Maps.newHashMap();
    private static final CharMatcher LINEAR_WHITE_SPACE = CharMatcher.anyOf(" \t\r\n");
    public static final MediaType MBOX = createConstant("application", "mbox");
    public static final MediaType MICROSOFT_EXCEL = createConstant("application", "vnd.ms-excel");
    public static final MediaType MICROSOFT_POWERPOINT = createConstant("application", "vnd.ms-powerpoint");
    public static final MediaType MICROSOFT_WORD = createConstant("application", "msword");
    public static final MediaType MP4_AUDIO = createConstant("audio", "mp4");
    public static final MediaType MP4_VIDEO = createConstant("video", "mp4");
    public static final MediaType MPEG_AUDIO = createConstant("audio", "mpeg");
    public static final MediaType MPEG_VIDEO = createConstant("video", "mpeg");
    public static final MediaType OCTET_STREAM = createConstant("application", "octet-stream");
    public static final MediaType OGG_AUDIO = createConstant("audio", "ogg");
    public static final MediaType OGG_CONTAINER = createConstant("application", "ogg");
    public static final MediaType OGG_VIDEO = createConstant("video", "ogg");
    public static final MediaType OOXML_DOCUMENT = createConstant("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
    public static final MediaType OOXML_PRESENTATION = createConstant("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
    public static final MediaType OOXML_SHEET = createConstant("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
    public static final MediaType OPENDOCUMENT_GRAPHICS = createConstant("application", "vnd.oasis.opendocument.graphics");
    public static final MediaType OPENDOCUMENT_PRESENTATION = createConstant("application", "vnd.oasis.opendocument.presentation");
    public static final MediaType OPENDOCUMENT_SPREADSHEET = createConstant("application", "vnd.oasis.opendocument.spreadsheet");
    public static final MediaType OPENDOCUMENT_TEXT = createConstant("application", "vnd.oasis.opendocument.text");
    private static final com.google.common.base.Joiner.MapJoiner PARAMETER_JOINER = Joiner.on("; ").withKeyValueSeparator("=");
    public static final MediaType PDF = createConstant("application", "pdf");
    public static final MediaType PLAIN_TEXT_UTF_8 = createConstantUtf8("text", "plain");
    public static final MediaType PNG = createConstant("image", "png");
    public static final MediaType POSTSCRIPT = createConstant("application", "postscript");
    public static final MediaType PROTOBUF = createConstant("application", "protobuf");
    public static final MediaType PSD = createConstant("image", "vnd.adobe.photoshop");
    public static final MediaType QUICKTIME = createConstant("video", "quicktime");
    private static final CharMatcher QUOTED_TEXT_MATCHER;
    public static final MediaType RDF_XML_UTF_8 = createConstantUtf8("application", "rdf+xml");
    public static final MediaType RTF_UTF_8 = createConstantUtf8("application", "rtf");
    public static final MediaType SFNT = createConstant("application", "font-sfnt");
    public static final MediaType SHOCKWAVE_FLASH = createConstant("application", "x-shockwave-flash");
    public static final MediaType SKETCHUP = createConstant("application", "vnd.sketchup.skp");
    public static final MediaType SVG_UTF_8 = createConstantUtf8("image", "svg+xml");
    public static final MediaType TAR = createConstant("application", "x-tar");
    public static final MediaType TEXT_JAVASCRIPT_UTF_8 = createConstantUtf8("text", "javascript");
    private static final String TEXT_TYPE = "text";
    public static final MediaType TIFF = createConstant("image", "tiff");
    private static final CharMatcher TOKEN_MATCHER;
    public static final MediaType TSV_UTF_8 = createConstantUtf8("text", "tab-separated-values");
    private static final ImmutableListMultimap UTF_8_CONSTANT_PARAMETERS;
    public static final MediaType VCARD_UTF_8 = createConstantUtf8("text", "vcard");
    private static final String VIDEO_TYPE = "video";
    public static final MediaType WEBM_AUDIO = createConstant("audio", "webm");
    public static final MediaType WEBM_VIDEO = createConstant("video", "webm");
    public static final MediaType WEBP = createConstant("image", "webp");
    private static final String WILDCARD = "*";
    public static final MediaType WML_UTF_8 = createConstantUtf8("text", "vnd.wap.wml");
    public static final MediaType WMV = createConstant("video", "x-ms-wmv");
    public static final MediaType WOFF = createConstant("application", "font-woff");
    public static final MediaType XHTML_UTF_8 = createConstantUtf8("application", "xhtml+xml");
    public static final MediaType XML_UTF_8 = createConstantUtf8("text", "xml");
    public static final MediaType XRD_UTF_8 = createConstantUtf8("application", "xrd+xml");
    public static final MediaType ZIP = createConstant("application", "zip");
    private final ImmutableListMultimap parameters;
    private final String subtype;
    private final String type;

    private MediaType(String s, String s1, ImmutableListMultimap immutablelistmultimap)
    {
        type = s;
        subtype = s1;
        parameters = immutablelistmultimap;
    }

    private static MediaType addKnownType(MediaType mediatype)
    {
        KNOWN_TYPES.put(mediatype, mediatype);
        return mediatype;
    }

    public static MediaType create(String s, String s1)
    {
        return create(s, s1, ((Multimap) (ImmutableListMultimap.of())));
    }

    private static MediaType create(String s, String s1, Multimap multimap)
    {
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(s1);
        Preconditions.checkNotNull(multimap);
        s = normalizeToken(s);
        s1 = normalizeToken(s1);
        com.google.common.collect.ImmutableListMultimap.Builder builder;
        boolean flag;
        if (!"*".equals(s) || "*".equals(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "A wildcard type cannot be used with a non-wildcard subtype");
        builder = ImmutableListMultimap.builder();
        java.util.Map.Entry entry;
        String s2;
        for (multimap = multimap.entries().iterator(); multimap.hasNext(); builder.put(s2, normalizeParameterValue(s2, (String)entry.getValue())))
        {
            entry = (java.util.Map.Entry)multimap.next();
            s2 = normalizeToken((String)entry.getKey());
        }

        s = new MediaType(s, s1, builder.build());
        return (MediaType)MoreObjects.firstNonNull(KNOWN_TYPES.get(s), s);
    }

    static MediaType createApplicationType(String s)
    {
        return create("application", s);
    }

    static MediaType createAudioType(String s)
    {
        return create("audio", s);
    }

    private static MediaType createConstant(String s, String s1)
    {
        return addKnownType(new MediaType(s, s1, ImmutableListMultimap.of()));
    }

    private static MediaType createConstantUtf8(String s, String s1)
    {
        return addKnownType(new MediaType(s, s1, UTF_8_CONSTANT_PARAMETERS));
    }

    static MediaType createImageType(String s)
    {
        return create("image", s);
    }

    static MediaType createTextType(String s)
    {
        return create("text", s);
    }

    static MediaType createVideoType(String s)
    {
        return create("video", s);
    }

    private static String escapeAndQuote(String s)
    {
        StringBuilder stringbuilder = (new StringBuilder(s.length() + 16)).append('"');
        s = s.toCharArray();
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            char c = s[i];
            if (c == '\r' || c == '\\' || c == '"')
            {
                stringbuilder.append('\\');
            }
            stringbuilder.append(c);
        }

        return stringbuilder.append('"').toString();
    }

    private static String normalizeParameterValue(String s, String s1)
    {
        String s2 = s1;
        if ("charset".equals(s))
        {
            s2 = Ascii.toLowerCase(s1);
        }
        return s2;
    }

    private static String normalizeToken(String s)
    {
        Preconditions.checkArgument(TOKEN_MATCHER.matchesAllOf(s));
        return Ascii.toLowerCase(s);
    }

    private Map parametersAsMap()
    {
        return Maps.transformValues(parameters.asMap(), new Function() {

            final MediaType this$0;

            public ImmutableMultiset apply(Collection collection)
            {
                return ImmutableMultiset.copyOf(collection);
            }

            public volatile Object apply(Object obj)
            {
                return apply((Collection)obj);
            }

            
            {
                this$0 = MediaType.this;
                super();
            }
        });
    }

    public static MediaType parse(String s)
    {
        Tokenizer tokenizer;
        Preconditions.checkNotNull(s);
        tokenizer = new Tokenizer(s);
        String s1;
        String s2;
        com.google.common.collect.ImmutableListMultimap.Builder builder;
        s1 = tokenizer.consumeToken(TOKEN_MATCHER);
        tokenizer.consumeCharacter('/');
        s2 = tokenizer.consumeToken(TOKEN_MATCHER);
        builder = ImmutableListMultimap.builder();
_L6:
        Object obj;
        String s3;
        if (!tokenizer.hasMore())
        {
            break MISSING_BLOCK_LABEL_246;
        }
        tokenizer.consumeCharacter(';');
        tokenizer.consumeTokenIfPresent(LINEAR_WHITE_SPACE);
        s3 = tokenizer.consumeToken(TOKEN_MATCHER);
        tokenizer.consumeCharacter('=');
        if ('"' != tokenizer.previewChar())
        {
            break MISSING_BLOCK_LABEL_235;
        }
        tokenizer.consumeCharacter('"');
        obj = new StringBuilder();
_L5:
        if ('"' == tokenizer.previewChar()) goto _L2; else goto _L1
_L1:
        if ('\\' != tokenizer.previewChar()) goto _L4; else goto _L3
_L3:
        tokenizer.consumeCharacter('\\');
        ((StringBuilder) (obj)).append(tokenizer.consumeCharacter(CharMatcher.ASCII));
          goto _L5
_L4:
        try
        {
            ((StringBuilder) (obj)).append(tokenizer.consumeToken(QUOTED_TEXT_MATCHER));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            s = String.valueOf(String.valueOf(s));
            throw new IllegalArgumentException((new StringBuilder(s.length() + 18)).append("Could not parse '").append(s).append("'").toString(), ((Throwable) (obj)));
        }
          goto _L5
_L2:
        obj = ((StringBuilder) (obj)).toString();
        tokenizer.consumeCharacter('"');
_L7:
        builder.put(s3, obj);
          goto _L6
        obj = tokenizer.consumeToken(TOKEN_MATCHER);
          goto _L7
        obj = create(s1, s2, builder.build());
        return ((MediaType) (obj));
    }

    public Optional charset()
    {
        Object obj = ImmutableSet.copyOf(parameters.get("charset"));
        switch (((ImmutableSet) (obj)).size())
        {
        default:
            obj = String.valueOf(String.valueOf(obj));
            throw new IllegalStateException((new StringBuilder(((String) (obj)).length() + 33)).append("Multiple charset values defined: ").append(((String) (obj))).toString());

        case 0: // '\0'
            return Optional.absent();

        case 1: // '\001'
            return Optional.of(Charset.forName((String)Iterables.getOnlyElement(((Iterable) (obj)))));
        }
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof MediaType)
            {
                if (!type.equals(((MediaType) (obj = (MediaType)obj)).type) || !subtype.equals(((MediaType) (obj)).subtype) || !parametersAsMap().equals(((MediaType) (obj)).parametersAsMap()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public boolean hasWildcard()
    {
        return "*".equals(type) || "*".equals(subtype);
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            type, subtype, parametersAsMap()
        });
    }

    public boolean is(MediaType mediatype)
    {
        return (mediatype.type.equals("*") || mediatype.type.equals(type)) && (mediatype.subtype.equals("*") || mediatype.subtype.equals(subtype)) && parameters.entries().containsAll(mediatype.parameters.entries());
    }

    public ImmutableListMultimap parameters()
    {
        return parameters;
    }

    public String subtype()
    {
        return subtype;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(type).append('/').append(subtype);
        if (!parameters.isEmpty())
        {
            stringbuilder.append("; ");
            com.google.common.collect.ListMultimap listmultimap = Multimaps.transformValues(parameters, new Function() {

                final MediaType this$0;

                public volatile Object apply(Object obj)
                {
                    return apply((String)obj);
                }

                public String apply(String s)
                {
                    if (MediaType.TOKEN_MATCHER.matchesAllOf(s))
                    {
                        return s;
                    } else
                    {
                        return MediaType.escapeAndQuote(s);
                    }
                }

            
            {
                this$0 = MediaType.this;
                super();
            }
            });
            PARAMETER_JOINER.appendTo(stringbuilder, listmultimap.entries());
        }
        return stringbuilder.toString();
    }

    public String type()
    {
        return type;
    }

    public MediaType withCharset(Charset charset1)
    {
        Preconditions.checkNotNull(charset1);
        return withParameter("charset", charset1.name());
    }

    public MediaType withParameter(String s, String s1)
    {
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(s1);
        s = normalizeToken(s);
        com.google.common.collect.ImmutableListMultimap.Builder builder = ImmutableListMultimap.builder();
        Iterator iterator = parameters.entries().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            String s2 = (String)entry.getKey();
            if (!s.equals(s2))
            {
                builder.put(s2, entry.getValue());
            }
        } while (true);
        builder.put(s, normalizeParameterValue(s, s1));
        s = new MediaType(type, subtype, builder.build());
        return (MediaType)MoreObjects.firstNonNull(KNOWN_TYPES.get(s), s);
    }

    public MediaType withParameters(Multimap multimap)
    {
        return create(type, subtype, multimap);
    }

    public MediaType withoutParameters()
    {
        if (parameters.isEmpty())
        {
            return this;
        } else
        {
            return create(type, subtype);
        }
    }

    static 
    {
        UTF_8_CONSTANT_PARAMETERS = ImmutableListMultimap.of("charset", Ascii.toLowerCase(Charsets.UTF_8.name()));
        TOKEN_MATCHER = CharMatcher.ASCII.and(CharMatcher.JAVA_ISO_CONTROL.negate()).and(CharMatcher.isNot(' ')).and(CharMatcher.noneOf("()<>@,;:\\\"/[]?="));
        QUOTED_TEXT_MATCHER = CharMatcher.ASCII.and(CharMatcher.noneOf("\"\\\r"));
    }


}
