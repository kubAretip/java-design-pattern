package pl.pitera.flyweight.homework;

abstract class ChessPiece {

    private String name;
    private String numberPosition;
    private String letterPosition;
    private Color color;

    public ChessPiece(String name, String numberPosition, String letterPosition, ColorEnum chessPieceColor) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;

        switch (chessPieceColor) {
            case BLACK:
                this.color = ColorRepository.getBlack();
                break;
            case WHITE:
                this.color = ColorRepository.getWhite();
                break;
            default:
                throw new UnsupportedOperationException("Invalid color");
        }

    }

    public String getName() {
        return name;
    }

    public String getNumberPosition() {
        return numberPosition;
    }

    public String getLetterPosition() {
        return letterPosition;
    }

    public Color getColor() {
        return color;
    }
}
