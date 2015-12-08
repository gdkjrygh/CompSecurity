.class public final Lcom/google/android/gms/auth/api/credentials/CredentialRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/auth/api/credentials/CredentialRequest$1;,
        Lcom/google/android/gms/auth/api/credentials/CredentialRequest$Builder;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/auth/api/credentials/CredentialRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final zzCY:I

.field private final zzOY:Z

.field private final zzOZ:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/auth/api/credentials/zzb;

    invoke-direct {v0}, Lcom/google/android/gms/auth/api/credentials/zzb;-><init>()V

    sput-object v0, Lcom/google/android/gms/auth/api/credentials/CredentialRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IZ[Ljava/lang/String;)V
    .locals 0
    .param p1, "version"    # I
    .param p2, "supportsPasswordLogin"    # Z
    .param p3, "accountTypes"    # [Ljava/lang/String;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/auth/api/credentials/CredentialRequest;->zzCY:I

    iput-boolean p2, p0, Lcom/google/android/gms/auth/api/credentials/CredentialRequest;->zzOY:Z

    iput-object p3, p0, Lcom/google/android/gms/auth/api/credentials/CredentialRequest;->zzOZ:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/auth/api/credentials/CredentialRequest$Builder;)V
    .locals 1
    .param p1, "builder"    # Lcom/google/android/gms/auth/api/credentials/CredentialRequest$Builder;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/auth/api/credentials/CredentialRequest;->zzCY:I

    iget-boolean v0, p1, Lcom/google/android/gms/auth/api/credentials/CredentialRequest$Builder;->zzOY:Z

    iput-boolean v0, p0, Lcom/google/android/gms/auth/api/credentials/CredentialRequest;->zzOY:Z

    iget-object v0, p1, Lcom/google/android/gms/auth/api/credentials/CredentialRequest$Builder;->zzOZ:[Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/auth/api/credentials/CredentialRequest;->zzOZ:[Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/auth/api/credentials/CredentialRequest$Builder;Lcom/google/android/gms/auth/api/credentials/CredentialRequest$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/android/gms/auth/api/credentials/CredentialRequest$Builder;
    .param p2, "x1"    # Lcom/google/android/gms/auth/api/credentials/CredentialRequest$1;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/auth/api/credentials/CredentialRequest;-><init>(Lcom/google/android/gms/auth/api/credentials/CredentialRequest$Builder;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getAccountTypes()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/credentials/CredentialRequest;->zzOZ:[Ljava/lang/String;

    return-object v0
.end method

.method public getSupportsPasswordLogin()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/auth/api/credentials/CredentialRequest;->zzOY:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/auth/api/credentials/zzb;->zza(Lcom/google/android/gms/auth/api/credentials/CredentialRequest;Landroid/os/Parcel;I)V

    return-void
.end method
