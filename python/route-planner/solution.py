import numpy


def route_search(from_row, from_column, to_row, to_column, map_matrix, map_visited):
    if (
        from_row < 0
        or from_column < 0
        or from_row >= len(map_matrix)
        or from_column >= len(map_matrix[0])
    ):
        return False

    if (
        map_visited[from_row][from_column]
        or map_matrix[from_row][from_column] is False
        or map_matrix[to_row][to_column] is False
    ):
        return False

    if from_row == to_row and from_column == to_column:
        return True

    map_visited[from_row][from_column] = True

    return (
        route_search(
            from_row - 1, from_column, to_row, to_column, map_matrix, map_visited
        )
        or route_search(
            from_row, from_column - 1, to_row, to_column, map_matrix, map_visited
        )
        or route_search(
            from_row + 1, from_column, to_row, to_column, map_matrix, map_visited
        )
        or route_search(
            from_row, from_column + 1, to_row, to_column, map_matrix, map_visited
        )
    )


def route_exists(from_row, from_column, to_row, to_column, map_matrix):
    map_visited = numpy.full((len(map_matrix), len(map_matrix[0])), False)
    return route_search(
        from_row, from_column, to_row, to_column, map_matrix, map_visited
    )


if __name__ == "__main__":
    map_matrix = [[True, False, False], [True, True, False], [False, True, True]]

    print(route_exists(0, 0, 2, 2, map_matrix))
