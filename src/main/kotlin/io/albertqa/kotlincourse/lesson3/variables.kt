package io.albertqa.io.albertqa.kotlincourse.lesson3

//Название мероприятия
val name: String = "Hackathon Survival"

//Дата проведения
var date: String = "2024.04.09"

//Место проведения
val place: String = "Moscow"

//Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
var equipment: String = "100000"

//Количество участников
var member: Int = 0
    get() = field
    private set(value) {field = value}

//Длительность хакатона
val duration: Long = 8*60*60

//Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
private lateinit var contacts: String

//Текущее состояние хакатона (статус)
var status: String = "Не начат"

//Список спонсоров
val sponsor: String = "KFC"

//Бюджет мероприятия
var totalBudget: Int = 1200000

//Текущий уровень доступа к интернету
var connectionStatus: Int = 10

//Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
private var transport: String = "Info"

//Количество команд
var commandQuantity: Int = 0

//Перечень задач
val tasks: String = "Tasks"

//План эвакуации
val evacuationPlan: String = "Plan"

//Список доступного оборудования
var availableEquipment: String = "50"

//Список свободного оборудования
var freeEquipment: String = "50"

//График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
lateinit var foodSchedule: String

//План мероприятий на случай сбоев
var failurePlan: String = "Fail"

//Список экспертов и жюри
var listExpert: String = "Experts"

//Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.
var feedback: String by lazy {
    "Feedbacks"
}

//Политика конфиденциальности
val policy: String = "Policy"

//Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
private var privateFeedback: String by lazy {
    "Feedbacks"
}

//Текущая температура в помещении
var currentTemperature: Int = 22

//Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.
var netMonitor: String = "1GB/s"

//Уровень освещения
var lightLevel: Int = 80

//Лог событий мероприятия
private var Logs: String = "Logs"

//Доступность медицинской помощи
var med: String = "Available"

//Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
private var safetyPlan: String = "Plan"

//Регистрационный номер мероприятия
val regnumber: Int = 123

//Максимально допустимый уровень шума в помещении хакатона.
var noiseLevel: Int = 70

//Индикатор превышения уровня шума в помещениях
val noiseIndicator: Boolean = false

//Формат мероприятия (зависит от геополитической обстановки)
var eventFormat: String = "Open"

//Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.
var availablePlace: Int = 0
    get() = field
    set(value){
        if (value >= 0) field = value
    }

//План взаимодействия с прессой
var media: String = "Plan"

//Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
var projectInfo: String by lazy {
    "Info"
}

//Статус получения всех необходимых разрешений
var permissionStatus: String = "Done"

//Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)
var exclusiveRes: String = "Public"

//Список партнеров мероприятия
var partnerList: String = "Partners"

//Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
var Report: String by lazy {
    "Report"
}

//План распределения призов
var awards: String = "Awards"

//Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.
private var rescueContactInfo: String = "12332"

//Особые условия для участников с ограниченными возможностями
var accesability: String = "Сonditions"

//Общее настроение участников (определяется опросами)
var mood: String = "Good"

//Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия.
var hackPlan: String = "Plan"

//Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.
var specialGuest: String = "Ilon Musk"

//Максимальное количество людей, которое может вместить место проведения.
val max_people: Int = 500

//Стандартное количество часов, отведенное каждой команде для работы над проектом.
val default_hours: Long = 1*60*60

//Текущая температура в помещении
var current_temperature: Int = 21
