package core.Utils;

public class Time {
	private int hours;
	private int minutes;
	
	public Time(int hours, int minutes) {
		if (isValidateTime (hours, minutes)){
			this.hours = hours;
			this.minutes = minutes;
		} else{
			throw new IllegalArgumentException("Hora inválida.");
		}
	}

	public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

	public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    // Verificar se o horário é válida
	public boolean isValidateTime(int hours, int minutes){
		if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59 ) {
            return false;
        }

		String timeStr = String.format("%02d:%02d", hours, minutes);
        if (!timeStr.matches("\\d{2}:\\d{2}")) {
            return false;
        }
		return true;
	}

	// converter o horário para String
	@Override
    public String toString() {
        return String.format("%02d:%02d", hours, minutes);
    }
}
