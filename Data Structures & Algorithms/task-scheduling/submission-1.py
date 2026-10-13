class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        frequencies = Counter(tasks)

        max_frequency= max(frequencies.values())
        max_frequency_tasks = sum(
            count == max_frequency
            for count in frequencies.values()
        )

        required_intervals=(
            (max_frequency-1)*(n+1)
            +max_frequency_tasks
        )
        return max(required_intervals, len(tasks))
        