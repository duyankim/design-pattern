## 템플릿 메서드 패턴 UML

파일 파싱 로직을 추상 클래스의 템플릿 메서드로 정의하여, 각 업무의 파일 레이아웃에 맞게 구현한 subClass로 파싱

```mermaid
classDiagram
    class FileParser {
        <<abstract>>
        - headerData: Header
        - dataLines: List~Data~
        - trailerData: Trailer
        + parseFile(path: String) void
        - readFile(path: String) void
        - parseHeader() void
        - parseData() void
        - parseTrailer() void
        - insert() void
    }

    class CmsParser
    class RprParser
    class IftParser
    class HofParser
    class EntParser

    FileParser <|-- CmsParser
    FileParser <|-- RprParser
    FileParser <|-- IftParser
    FileParser <|-- HofParser
    FileParser <|-- EntParser

```
