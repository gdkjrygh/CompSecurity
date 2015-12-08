.class public Lcom/google/android/gms/internal/zzlq;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzlq$zze;,
        Lcom/google/android/gms/internal/zzlq$zzc;,
        Lcom/google/android/gms/internal/zzlq$zzd;,
        Lcom/google/android/gms/internal/zzlq$zzb;,
        Lcom/google/android/gms/internal/zzlq$zza;
    }
.end annotation


# static fields
.field public static final zzahA:Lcom/google/android/gms/internal/zzlq$zzd;

.field public static final zzahB:Lcom/google/android/gms/internal/zzlq$zzc;

.field public static final zzahC:Lcom/google/android/gms/internal/zzlq$zze;

.field public static final zzahy:Lcom/google/android/gms/internal/zzlq$zza;

.field public static final zzahz:Lcom/google/android/gms/internal/zzlq$zzb;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const v3, 0x3e8fa0

    new-instance v0, Lcom/google/android/gms/internal/zzlq$zza;

    const-string v1, "created"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/zzlq$zza;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/zzlq;->zzahy:Lcom/google/android/gms/internal/zzlq$zza;

    new-instance v0, Lcom/google/android/gms/internal/zzlq$zzb;

    const-string v1, "lastOpenedTime"

    const v2, 0x419ce0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/zzlq$zzb;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/zzlq;->zzahz:Lcom/google/android/gms/internal/zzlq$zzb;

    new-instance v0, Lcom/google/android/gms/internal/zzlq$zzd;

    const-string v1, "modified"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/zzlq$zzd;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/zzlq;->zzahA:Lcom/google/android/gms/internal/zzlq$zzd;

    new-instance v0, Lcom/google/android/gms/internal/zzlq$zzc;

    const-string v1, "modifiedByMe"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/zzlq$zzc;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/zzlq;->zzahB:Lcom/google/android/gms/internal/zzlq$zzc;

    new-instance v0, Lcom/google/android/gms/internal/zzlq$zze;

    const-string v1, "sharedWithMe"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/zzlq$zze;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/zzlq;->zzahC:Lcom/google/android/gms/internal/zzlq$zze;

    return-void
.end method
