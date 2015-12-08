.class final enum Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;
.super Ljava/lang/Enum;
.source "CommonUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fabric/sdk/android/services/common/CommonUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "Architecture"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum ARM64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum ARMV6:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum ARMV7:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum ARMV7S:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum ARM_UNKNOWN:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum PPC:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum PPC64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum UNKNOWN:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum X86_32:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum X86_64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field private static final matcher:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    const/4 v3, 0x4

    .line 168
    new-instance v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v1, "X86_32"

    invoke-direct {v0, v1, v4}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->X86_32:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 169
    new-instance v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v1, "X86_64"

    invoke-direct {v0, v1, v5}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->X86_64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 170
    new-instance v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v1, "ARM_UNKNOWN"

    invoke-direct {v0, v1, v6}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARM_UNKNOWN:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 171
    new-instance v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v1, "PPC"

    invoke-direct {v0, v1, v7}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->PPC:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 172
    new-instance v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v1, "PPC64"

    invoke-direct {v0, v1, v3}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->PPC64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 173
    new-instance v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v1, "ARMV6"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARMV6:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 174
    new-instance v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v1, "ARMV7"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARMV7:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 175
    new-instance v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->UNKNOWN:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 176
    new-instance v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v1, "ARMV7S"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARMV7S:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 177
    new-instance v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v1, "ARM64"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARM64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 167
    const/16 v0, 0xa

    new-array v0, v0, [Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    sget-object v1, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->X86_32:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    aput-object v1, v0, v4

    sget-object v1, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->X86_64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    aput-object v1, v0, v5

    sget-object v1, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARM_UNKNOWN:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    aput-object v1, v0, v6

    sget-object v1, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->PPC:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    aput-object v1, v0, v7

    sget-object v1, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->PPC64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    aput-object v1, v0, v3

    const/4 v1, 0x5

    sget-object v2, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARMV6:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARMV7:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->UNKNOWN:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARMV7S:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARM64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    aput-object v2, v0, v1

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->$VALUES:[Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 179
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v3}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->matcher:Ljava/util/Map;

    .line 182
    sget-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->matcher:Ljava/util/Map;

    const-string v1, "armeabi-v7a"

    sget-object v2, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARMV7:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    sget-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->matcher:Ljava/util/Map;

    const-string v1, "armeabi"

    sget-object v2, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARMV6:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    sget-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->matcher:Ljava/util/Map;

    const-string v1, "x86"

    sget-object v2, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->X86_32:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 167
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method static getValue()Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;
    .locals 5

    .prologue
    .line 192
    sget-object v0, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    .line 194
    .local v0, "arch":Ljava/lang/String;
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 195
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v2

    const-string v3, "Fabric"

    const-string v4, "Architecture#getValue()::Build.CPU_ABI returned null or empty"

    invoke-interface {v2, v3, v4}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    sget-object v1, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->UNKNOWN:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 205
    :cond_0
    :goto_0
    return-object v1

    .line 200
    :cond_1
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 201
    sget-object v2, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->matcher:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 202
    .local v1, "value":Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;
    if-nez v1, :cond_0

    .line 203
    sget-object v1, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->UNKNOWN:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    goto :goto_0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 167
    const-class v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    return-object v0
.end method

.method public static values()[Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;
    .locals 1

    .prologue
    .line 167
    sget-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->$VALUES:[Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    invoke-virtual {v0}, [Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    return-object v0
.end method
