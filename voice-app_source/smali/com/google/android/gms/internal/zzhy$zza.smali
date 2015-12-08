.class Lcom/google/android/gms/internal/zzhy$zza;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzhy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "zza"
.end annotation


# instance fields
.field public final zzGW:Lcom/google/android/gms/internal/zzhx$zzc;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzhx$zzc",
            "<TT;>;"
        }
    .end annotation
.end field

.field public final zzGX:Lcom/google/android/gms/internal/zzhx$zza;

.field final synthetic zzGY:Lcom/google/android/gms/internal/zzhy;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzhy;Lcom/google/android/gms/internal/zzhx$zzc;Lcom/google/android/gms/internal/zzhx$zza;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzhx$zzc",
            "<TT;>;",
            "Lcom/google/android/gms/internal/zzhx$zza;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/zzhy$zza;->zzGY:Lcom/google/android/gms/internal/zzhy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/zzhy$zza;->zzGW:Lcom/google/android/gms/internal/zzhx$zzc;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzhy$zza;->zzGX:Lcom/google/android/gms/internal/zzhx$zza;

    return-void
.end method
