.class final enum Lcom/google/android/gms/tagmanager/zzay$zza;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/tagmanager/zzay;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "zza"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/android/gms/tagmanager/zzay$zza;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum zzaMa:Lcom/google/android/gms/tagmanager/zzay$zza;

.field public static final enum zzaMb:Lcom/google/android/gms/tagmanager/zzay$zza;

.field public static final enum zzaMc:Lcom/google/android/gms/tagmanager/zzay$zza;

.field private static final synthetic zzaMd:[Lcom/google/android/gms/tagmanager/zzay$zza;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/google/android/gms/tagmanager/zzay$zza;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/tagmanager/zzay$zza;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/tagmanager/zzay$zza;->zzaMa:Lcom/google/android/gms/tagmanager/zzay$zza;

    new-instance v0, Lcom/google/android/gms/tagmanager/zzay$zza;

    const-string v1, "URL"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/tagmanager/zzay$zza;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/tagmanager/zzay$zza;->zzaMb:Lcom/google/android/gms/tagmanager/zzay$zza;

    new-instance v0, Lcom/google/android/gms/tagmanager/zzay$zza;

    const-string v1, "BACKSLASH"

    invoke-direct {v0, v1, v4}, Lcom/google/android/gms/tagmanager/zzay$zza;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/tagmanager/zzay$zza;->zzaMc:Lcom/google/android/gms/tagmanager/zzay$zza;

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/google/android/gms/tagmanager/zzay$zza;

    sget-object v1, Lcom/google/android/gms/tagmanager/zzay$zza;->zzaMa:Lcom/google/android/gms/tagmanager/zzay$zza;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/tagmanager/zzay$zza;->zzaMb:Lcom/google/android/gms/tagmanager/zzay$zza;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/android/gms/tagmanager/zzay$zza;->zzaMc:Lcom/google/android/gms/tagmanager/zzay$zza;

    aput-object v1, v0, v4

    sput-object v0, Lcom/google/android/gms/tagmanager/zzay$zza;->zzaMd:[Lcom/google/android/gms/tagmanager/zzay$zza;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/android/gms/tagmanager/zzay$zza;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    const-class v0, Lcom/google/android/gms/tagmanager/zzay$zza;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tagmanager/zzay$zza;

    return-object v0
.end method

.method public static values()[Lcom/google/android/gms/tagmanager/zzay$zza;
    .locals 1

    sget-object v0, Lcom/google/android/gms/tagmanager/zzay$zza;->zzaMd:[Lcom/google/android/gms/tagmanager/zzay$zza;

    invoke-virtual {v0}, [Lcom/google/android/gms/tagmanager/zzay$zza;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/tagmanager/zzay$zza;

    return-object v0
.end method
