.class enum Lcom/crashlytics/android/core/WireFormat$FieldType;
.super Ljava/lang/Enum;
.source "WireFormat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/crashlytics/android/core/WireFormat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4008
    name = "FieldType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/crashlytics/android/core/WireFormat$FieldType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum BOOL:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum BYTES:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum DOUBLE:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum ENUM:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum FIXED32:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum FIXED64:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum FLOAT:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum GROUP:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum INT32:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum INT64:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum MESSAGE:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum SFIXED32:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum SFIXED64:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum SINT32:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum SINT64:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum STRING:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum UINT32:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum UINT64:Lcom/crashlytics/android/core/WireFormat$FieldType;


# instance fields
.field private final javaType:Lcom/crashlytics/android/core/WireFormat$JavaType;

.field private final wireType:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x3

    const/4 v7, 0x5

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 109
    new-instance v0, Lcom/crashlytics/android/core/WireFormat$FieldType;

    const-string v1, "DOUBLE"

    sget-object v2, Lcom/crashlytics/android/core/WireFormat$JavaType;->DOUBLE:Lcom/crashlytics/android/core/WireFormat$JavaType;

    invoke-direct {v0, v1, v4, v2, v5}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v0, Lcom/crashlytics/android/core/WireFormat$FieldType;->DOUBLE:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 110
    new-instance v0, Lcom/crashlytics/android/core/WireFormat$FieldType;

    const-string v1, "FLOAT"

    sget-object v2, Lcom/crashlytics/android/core/WireFormat$JavaType;->FLOAT:Lcom/crashlytics/android/core/WireFormat$JavaType;

    invoke-direct {v0, v1, v5, v2, v7}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v0, Lcom/crashlytics/android/core/WireFormat$FieldType;->FLOAT:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 111
    new-instance v0, Lcom/crashlytics/android/core/WireFormat$FieldType;

    const-string v1, "INT64"

    sget-object v2, Lcom/crashlytics/android/core/WireFormat$JavaType;->LONG:Lcom/crashlytics/android/core/WireFormat$JavaType;

    invoke-direct {v0, v1, v6, v2, v4}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v0, Lcom/crashlytics/android/core/WireFormat$FieldType;->INT64:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 112
    new-instance v0, Lcom/crashlytics/android/core/WireFormat$FieldType;

    const-string v1, "UINT64"

    sget-object v2, Lcom/crashlytics/android/core/WireFormat$JavaType;->LONG:Lcom/crashlytics/android/core/WireFormat$JavaType;

    invoke-direct {v0, v1, v8, v2, v4}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v0, Lcom/crashlytics/android/core/WireFormat$FieldType;->UINT64:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 113
    new-instance v0, Lcom/crashlytics/android/core/WireFormat$FieldType;

    const-string v1, "INT32"

    const/4 v2, 0x4

    sget-object v3, Lcom/crashlytics/android/core/WireFormat$JavaType;->INT:Lcom/crashlytics/android/core/WireFormat$JavaType;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v0, Lcom/crashlytics/android/core/WireFormat$FieldType;->INT32:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 114
    new-instance v0, Lcom/crashlytics/android/core/WireFormat$FieldType;

    const-string v1, "FIXED64"

    sget-object v2, Lcom/crashlytics/android/core/WireFormat$JavaType;->LONG:Lcom/crashlytics/android/core/WireFormat$JavaType;

    invoke-direct {v0, v1, v7, v2, v5}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v0, Lcom/crashlytics/android/core/WireFormat$FieldType;->FIXED64:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 115
    new-instance v0, Lcom/crashlytics/android/core/WireFormat$FieldType;

    const-string v1, "FIXED32"

    const/4 v2, 0x6

    sget-object v3, Lcom/crashlytics/android/core/WireFormat$JavaType;->INT:Lcom/crashlytics/android/core/WireFormat$JavaType;

    invoke-direct {v0, v1, v2, v3, v7}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v0, Lcom/crashlytics/android/core/WireFormat$FieldType;->FIXED32:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 116
    new-instance v0, Lcom/crashlytics/android/core/WireFormat$FieldType;

    const-string v1, "BOOL"

    const/4 v2, 0x7

    sget-object v3, Lcom/crashlytics/android/core/WireFormat$JavaType;->BOOLEAN:Lcom/crashlytics/android/core/WireFormat$JavaType;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v0, Lcom/crashlytics/android/core/WireFormat$FieldType;->BOOL:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 117
    new-instance v0, Lcom/crashlytics/android/core/WireFormat$FieldType$1;

    const-string v1, "STRING"

    const/16 v2, 0x8

    sget-object v3, Lcom/crashlytics/android/core/WireFormat$JavaType;->STRING:Lcom/crashlytics/android/core/WireFormat$JavaType;

    invoke-direct {v0, v1, v2, v3, v6}, Lcom/crashlytics/android/core/WireFormat$FieldType$1;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v0, Lcom/crashlytics/android/core/WireFormat$FieldType;->STRING:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 120
    new-instance v0, Lcom/crashlytics/android/core/WireFormat$FieldType$2;

    const-string v1, "GROUP"

    const/16 v2, 0x9

    sget-object v3, Lcom/crashlytics/android/core/WireFormat$JavaType;->MESSAGE:Lcom/crashlytics/android/core/WireFormat$JavaType;

    invoke-direct {v0, v1, v2, v3, v8}, Lcom/crashlytics/android/core/WireFormat$FieldType$2;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v0, Lcom/crashlytics/android/core/WireFormat$FieldType;->GROUP:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 123
    new-instance v0, Lcom/crashlytics/android/core/WireFormat$FieldType$3;

    const-string v1, "MESSAGE"

    const/16 v2, 0xa

    sget-object v3, Lcom/crashlytics/android/core/WireFormat$JavaType;->MESSAGE:Lcom/crashlytics/android/core/WireFormat$JavaType;

    invoke-direct {v0, v1, v2, v3, v6}, Lcom/crashlytics/android/core/WireFormat$FieldType$3;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v0, Lcom/crashlytics/android/core/WireFormat$FieldType;->MESSAGE:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 126
    new-instance v0, Lcom/crashlytics/android/core/WireFormat$FieldType$4;

    const-string v1, "BYTES"

    const/16 v2, 0xb

    sget-object v3, Lcom/crashlytics/android/core/WireFormat$JavaType;->BYTE_STRING:Lcom/crashlytics/android/core/WireFormat$JavaType;

    invoke-direct {v0, v1, v2, v3, v6}, Lcom/crashlytics/android/core/WireFormat$FieldType$4;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v0, Lcom/crashlytics/android/core/WireFormat$FieldType;->BYTES:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 129
    new-instance v0, Lcom/crashlytics/android/core/WireFormat$FieldType;

    const-string v1, "UINT32"

    const/16 v2, 0xc

    sget-object v3, Lcom/crashlytics/android/core/WireFormat$JavaType;->INT:Lcom/crashlytics/android/core/WireFormat$JavaType;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v0, Lcom/crashlytics/android/core/WireFormat$FieldType;->UINT32:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 130
    new-instance v0, Lcom/crashlytics/android/core/WireFormat$FieldType;

    const-string v1, "ENUM"

    const/16 v2, 0xd

    sget-object v3, Lcom/crashlytics/android/core/WireFormat$JavaType;->ENUM:Lcom/crashlytics/android/core/WireFormat$JavaType;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v0, Lcom/crashlytics/android/core/WireFormat$FieldType;->ENUM:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 131
    new-instance v0, Lcom/crashlytics/android/core/WireFormat$FieldType;

    const-string v1, "SFIXED32"

    const/16 v2, 0xe

    sget-object v3, Lcom/crashlytics/android/core/WireFormat$JavaType;->INT:Lcom/crashlytics/android/core/WireFormat$JavaType;

    invoke-direct {v0, v1, v2, v3, v7}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v0, Lcom/crashlytics/android/core/WireFormat$FieldType;->SFIXED32:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 132
    new-instance v0, Lcom/crashlytics/android/core/WireFormat$FieldType;

    const-string v1, "SFIXED64"

    const/16 v2, 0xf

    sget-object v3, Lcom/crashlytics/android/core/WireFormat$JavaType;->LONG:Lcom/crashlytics/android/core/WireFormat$JavaType;

    invoke-direct {v0, v1, v2, v3, v5}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v0, Lcom/crashlytics/android/core/WireFormat$FieldType;->SFIXED64:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 133
    new-instance v0, Lcom/crashlytics/android/core/WireFormat$FieldType;

    const-string v1, "SINT32"

    const/16 v2, 0x10

    sget-object v3, Lcom/crashlytics/android/core/WireFormat$JavaType;->INT:Lcom/crashlytics/android/core/WireFormat$JavaType;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v0, Lcom/crashlytics/android/core/WireFormat$FieldType;->SINT32:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 134
    new-instance v0, Lcom/crashlytics/android/core/WireFormat$FieldType;

    const-string v1, "SINT64"

    const/16 v2, 0x11

    sget-object v3, Lcom/crashlytics/android/core/WireFormat$JavaType;->LONG:Lcom/crashlytics/android/core/WireFormat$JavaType;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v0, Lcom/crashlytics/android/core/WireFormat$FieldType;->SINT64:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 108
    const/16 v0, 0x12

    new-array v0, v0, [Lcom/crashlytics/android/core/WireFormat$FieldType;

    sget-object v1, Lcom/crashlytics/android/core/WireFormat$FieldType;->DOUBLE:Lcom/crashlytics/android/core/WireFormat$FieldType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/crashlytics/android/core/WireFormat$FieldType;->FLOAT:Lcom/crashlytics/android/core/WireFormat$FieldType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/crashlytics/android/core/WireFormat$FieldType;->INT64:Lcom/crashlytics/android/core/WireFormat$FieldType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/crashlytics/android/core/WireFormat$FieldType;->UINT64:Lcom/crashlytics/android/core/WireFormat$FieldType;

    aput-object v1, v0, v8

    const/4 v1, 0x4

    sget-object v2, Lcom/crashlytics/android/core/WireFormat$FieldType;->INT32:Lcom/crashlytics/android/core/WireFormat$FieldType;

    aput-object v2, v0, v1

    sget-object v1, Lcom/crashlytics/android/core/WireFormat$FieldType;->FIXED64:Lcom/crashlytics/android/core/WireFormat$FieldType;

    aput-object v1, v0, v7

    const/4 v1, 0x6

    sget-object v2, Lcom/crashlytics/android/core/WireFormat$FieldType;->FIXED32:Lcom/crashlytics/android/core/WireFormat$FieldType;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/crashlytics/android/core/WireFormat$FieldType;->BOOL:Lcom/crashlytics/android/core/WireFormat$FieldType;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/crashlytics/android/core/WireFormat$FieldType;->STRING:Lcom/crashlytics/android/core/WireFormat$FieldType;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/crashlytics/android/core/WireFormat$FieldType;->GROUP:Lcom/crashlytics/android/core/WireFormat$FieldType;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/crashlytics/android/core/WireFormat$FieldType;->MESSAGE:Lcom/crashlytics/android/core/WireFormat$FieldType;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/crashlytics/android/core/WireFormat$FieldType;->BYTES:Lcom/crashlytics/android/core/WireFormat$FieldType;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/crashlytics/android/core/WireFormat$FieldType;->UINT32:Lcom/crashlytics/android/core/WireFormat$FieldType;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lcom/crashlytics/android/core/WireFormat$FieldType;->ENUM:Lcom/crashlytics/android/core/WireFormat$FieldType;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lcom/crashlytics/android/core/WireFormat$FieldType;->SFIXED32:Lcom/crashlytics/android/core/WireFormat$FieldType;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lcom/crashlytics/android/core/WireFormat$FieldType;->SFIXED64:Lcom/crashlytics/android/core/WireFormat$FieldType;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lcom/crashlytics/android/core/WireFormat$FieldType;->SINT32:Lcom/crashlytics/android/core/WireFormat$FieldType;

    aput-object v2, v0, v1

    const/16 v1, 0x11

    sget-object v2, Lcom/crashlytics/android/core/WireFormat$FieldType;->SINT64:Lcom/crashlytics/android/core/WireFormat$FieldType;

    aput-object v2, v0, v1

    sput-object v0, Lcom/crashlytics/android/core/WireFormat$FieldType;->$VALUES:[Lcom/crashlytics/android/core/WireFormat$FieldType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V
    .locals 0
    .param p3, "javaType"    # Lcom/crashlytics/android/core/WireFormat$JavaType;
    .param p4, "wireType"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/crashlytics/android/core/WireFormat$JavaType;",
            "I)V"
        }
    .end annotation

    .prologue
    .line 136
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 137
    iput-object p3, p0, Lcom/crashlytics/android/core/WireFormat$FieldType;->javaType:Lcom/crashlytics/android/core/WireFormat$JavaType;

    .line 138
    iput p4, p0, Lcom/crashlytics/android/core/WireFormat$FieldType;->wireType:I

    .line 139
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;ILcom/crashlytics/android/core/WireFormat$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # I
    .param p3, "x2"    # Lcom/crashlytics/android/core/WireFormat$JavaType;
    .param p4, "x3"    # I
    .param p5, "x4"    # Lcom/crashlytics/android/core/WireFormat$1;

    .prologue
    .line 108
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/crashlytics/android/core/WireFormat$FieldType;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 108
    const-class v0, Lcom/crashlytics/android/core/WireFormat$FieldType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/crashlytics/android/core/WireFormat$FieldType;

    return-object v0
.end method

.method public static values()[Lcom/crashlytics/android/core/WireFormat$FieldType;
    .locals 1

    .prologue
    .line 108
    sget-object v0, Lcom/crashlytics/android/core/WireFormat$FieldType;->$VALUES:[Lcom/crashlytics/android/core/WireFormat$FieldType;

    invoke-virtual {v0}, [Lcom/crashlytics/android/core/WireFormat$FieldType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/crashlytics/android/core/WireFormat$FieldType;

    return-object v0
.end method


# virtual methods
.method public getJavaType()Lcom/crashlytics/android/core/WireFormat$JavaType;
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lcom/crashlytics/android/core/WireFormat$FieldType;->javaType:Lcom/crashlytics/android/core/WireFormat$JavaType;

    return-object v0
.end method

.method public getWireType()I
    .locals 1

    .prologue
    .line 145
    iget v0, p0, Lcom/crashlytics/android/core/WireFormat$FieldType;->wireType:I

    return v0
.end method

.method public isPackable()Z
    .locals 1

    .prologue
    .line 147
    const/4 v0, 0x1

    return v0
.end method
